package com.senarios.simxx.fragments.mainactivityfragments;


import static android.app.Activity.RESULT_OK;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.hdev.common.Constants;
import com.hdev.common.datamodels.S3UploadRequest;
import com.hdev.common.datamodels.SignupUserDetails;
import com.hdev.common.datamodels.Users;
import com.senarios.simxx.FragmentTags;
import com.senarios.simxx.R;
import com.senarios.simxx.Utility;
import com.senarios.simxx.databinding.CreateProfileFragment1Binding;
import com.senarios.simxx.fragments.BaseFragment;
import com.video_trim.TrimmerActivity;

import net.alhazmy13.mediapicker.Video.VideoPicker;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class CreateProfile extends BaseFragment implements Constants.SharedPreference {
    private CreateProfileFragment1Binding binding;
    private S3UploadRequest s3UploadRequest = new S3UploadRequest();
    private FirebaseAuth auth;
    private FirebaseDatabase database;
    FirebaseStorage storage;
    String path;

    public CreateProfile() {
        // Required empty public constructor
    }


    @Override
    protected View getview(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.create_profile_fragment1, container, false);
        binding = DataBindingUtil.bind(view);
        init();
        return view;
    }

    @Override
    protected void init() {
        super.init();
//        if (getViewModel().getSharedPreference().getString(USER_TYPE,"").equalsIgnoreCase(UserType.RemoteWorker.toString())) {
//            binding.selectVideo.setVisibility(View.GONE);
//            binding.textviewUploadcv.setVisibility(View.GONE);
//        }
        database = FirebaseDatabase.getInstance();
        storage = FirebaseStorage.getInstance();
        auth = FirebaseAuth.getInstance();
        binding.completeProfileButton.setOnClickListener(view -> {
            checks();
        });

        binding.infoGreyButton.setOnClickListener(view -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(Constants.LinkedIn.FindProfile));
            new Intent(Intent.ACTION_VIEW, Uri.parse(Constants.LinkedIn.FindProfile));
            startActivity(browserIntent);
        });
        binding.selectVideo.setOnClickListener(view -> {
            Utility.showVidepPicker(requireActivity());
        });


        binding.playButton.setOnClickListener(view -> {
            if (s3UploadRequest.getPath() != null) {
                Utility.openVideoIntent(requireContext(), s3UploadRequest.getPath());
            }
        });
//        binding.setHourlyRate.setText("0");
//        binding.setHourlyRate.setEnabled(false);
        binding.setLinkeldnProfileLink.setText(getString(R.string.linkedin_link));

//        if (getViewModel().getSharedPreference().getString(USER_TYPE,"").equals(UserType.RemoteWorker.toString()))
//        {
//            binding.setHourlyRate.setText("0");
//            binding.setHourlyRate.setEnabled(false);
//        }


//        binding.setLinkeldnProfileLink.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                if (s.length()<getString(R.string.linkedin_link).length()){
//                    binding.setLinkeldnProfileLink.setText(getString(R.string.linkedin_link));
//                    binding.setLinkeldnProfileLink.setSelection(getString(R.string.linkedin_link).length());
//                }
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });

    }

    private void checks() {
//        if (Utility.getString(binding.setLinkeldnProfileLink).isEmpty()){
//            binding.setLinkeldnProfileLink.setError("Please Enter Username");
//            binding.setLinkeldnProfileLink.requestFocus();
//        }
//        else
//        if (Utility.getString(binding.setHourlyRate).isEmpty()) {
//            binding.setHourlyRate.setError("Please Enter Hourly Rate");
//            binding.setHourlyRate.requestFocus();
//        }
//        else if (!Utility.getString(binding.setLinkeldnProfileLink).startsWith(getString(R.string.linkedin_link))){
//            binding.setLinkeldnProfileLink.setError("Please Enter valid profile link");
//            binding.setLinkeldnProfileLink.requestFocus();
//        }
//        else if (Integer.parseInt(Utility.getString(binding.setHourlyRate))<20 ){
//            binding.setHourlyRate.setError("Please Enter valid Hourly Rate that should be atleast 20");
//            binding.setHourlyRate.requestFocus();
//        }
//        else if (!Utility.getString(binding.setLinkeldnProfileLink).contains("linkedin.com")){
//            binding.setLinkeldnProfileLink.setError("Please enter valid Link");
//            binding.setLinkeldnProfileLink.requestFocus();
//        }
//        else if (getViewModel().getSharedPreference().getString(USER_TYPE,"").equalsIgnoreCase(UserType.SAP_Freelancer.toString()) && s3UploadRequest.getPath() == null) {
//                Utility.getAlertDialoge(requireContext(), "Select Video CV", "You need to select a recorded video cv which will be uploaded and used when you apply on jobs.")
//                        .setPositiveButton("Alright", (dialog, which) -> {
//                            dialog.dismiss();
//                            binding.selectVideo.performClick();
//                        })
//                        .setNegativeButton("Nope", (dialog, which) -> {
//                            dialog.dismiss();
//                        })
//                        .show();
//        }
//        else {
            String[] arr = getString(binding.setLinkeldnProfileLink).split("/");
            getViewModel().getSharedPreference().edit().putString(Constants.SharedPreference.LINKED_IN_LINK, Utility.getString(binding.setLinkeldnProfileLink).split("/")[arr.length - 1]).apply();
//            getViewModel().getSharedPreference().edit().putString(Constants.SharedPreference.HOURLY_RATE, Utility.getString(binding.setHourlyRate)).apply();
            createFirebaseUser();
//        }


    }

    private void postUser() {
        if (Utility.isNetworkAvailable(requireContext())) {
            getDialog().show();
            SharedPreferences editor1 = getContext().getSharedPreferences("my", Context.MODE_PRIVATE);
            String skill = editor1.getString(SharedPreference.ACCOUNT_TYPE, "");
            Users user = new Users();
            user.setSkills(skill);
            Utility.showLog(" " + user.getSkills());
            user.setRate(getViewModel().getSharedPreference().getString(Constants.SharedPreference.HOURLY_RATE, ""));
            user.setLink("NA");
            user.setPicture(getViewModel().getSharedPreference().getString(Firebase_Create_Id,""));
            user.setEmail(getViewModel().getSharedPreference().getString(Constants.SharedPreference.Email, ""));
            user.setUsername(getViewModel().getSharedPreference().getString(Firebase_Create_Id, ""));
            user.setName(getViewModel().getSharedPreference().getString(Fullname, ""));
            user.setArn("NA");
            user.setCredit(0.0f);
            user.setLinkedin("NA");
            user.setPassword("12345678");
            user.setQbid(String.valueOf(getViewModel().getSharedPreference().getInt(Constants.QB.QB_ID, 0)));
            user.setPaypal(false);
            user.setBroadcasts(0);
//            user.setStatus("unapproved");
//            user.setBankName("");
//            user.setAccountNo("");
            HashMap<String, Object> map = new HashMap<>();
            map.put("resource", user);
            getViewModel().getService(Constants.DreamFactory.URL).postUser(map)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new SingleObserver<Response<JsonObject>>() {
                        @Override
                        public void onSubscribe(Disposable d) {

                        }

                        @Override
                        public void onSuccess(Response<JsonObject> jsonObjectResponse) {
                            getDialog().dismiss();
                            Log.v("postuser", jsonObjectResponse.toString());
                            Log.v("user", new Gson().toJson(map));
                            if (jsonObjectResponse.isSuccessful()) {
                                if (jsonObjectResponse.code() == 200) {
                                    Log.v("postuser", jsonObjectResponse.toString());
                                    getViewModel().getSharedPreference().edit().putString(Constants.SharedPreference.USER, new Gson().toJson(user)).apply();
                                    getViewModel().getSharedPreference().edit().putBoolean(Constants.SharedPreference.Login_Boolean, true).apply();
                                    Toast.makeText(getContext(), "Successfull", Toast.LENGTH_SHORT).show();
//                                    s3UploadRequest.setKey(user.getUsername());
//                                    s3UploadRequest.setS3_PATH(Constants.S3Constants.VIDEO_CV_FOLDER+"/"+s3UploadRequest.getKey()+OfflineStreamActivity.EXT);
//                                    s3UploadRequest.setAction(S3UploadRequest.UploadActions.VIDEOCV);
//                                    if (getViewModel().getSharedPreference().getString(USER_TYPE,"").equalsIgnoreCase(UserType.SAP_Freelancer.toString())){
//                                    getViewModel().setPreferences(Constants.SharedPreference.ISUPLOADING, true);
//                                        Intent intent=new Intent(requireContext(), AmazonS3UploadService.class);
//                                        intent.putExtra(S3_REQUEST,s3UploadRequest);
//                                        requireContext().startService(intent);
//                                    }
                                    getActivityContainer().OnFragmentChange(new HomeFragment(), FragmentTags.HOME);


                                } else {

                                    Toast.makeText(getContext(), "Something went wrong..", Toast.LENGTH_SHORT).show();
                                }


                            } else {
                                Toast.makeText(getContext(), "Something went wrong..", Toast.LENGTH_SHORT).show();

                            }
                        }

                        @Override
                        public void onError(Throwable e) {
                            getDialog().dismiss();
                            Toast.makeText(getContext(), "Something went wrong..", Toast.LENGTH_SHORT).show();

                        }
                    });


        } else {
            Toast.makeText(getContext(), "Please enable wifi/data", Toast.LENGTH_SHORT).show();
        }
    }

    private void createFirebaseUser() {
        getDialog().show();
        String emailsp = getViewModel().getSharedPreference().getString(SharedPreference.Email, "");
        String passsp = getViewModel().getSharedPreference().getString(SharedPreference.PASSWORD, "");
        Log.wtf("emialuser", emailsp+passsp);
        auth.createUserWithEmailAndPassword(emailsp,passsp)
                .addOnSuccessListener(authResult -> {
                    database = FirebaseDatabase.getInstance();
                    SignupUserDetails signupUserDetails = new SignupUserDetails(getViewModel().getSharedPreference().getString(SharedPreference.Fullname, "")
                            , path, getViewModel().getSharedPreference().getString(SharedPreference.Email, ""));
                    database.getReference("UserNames").child(auth.getCurrentUser().getUid())
                            .setValue(signupUserDetails).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()) {
                                getViewModel().getSharedPreference().edit().putString(Constants.SharedPreference.Firebase_Create_Id, auth.getCurrentUser().getUid()).apply();
                                postUser();
//                                sharedVM.getSharedPreference().edit().putString(Constants.SharedPreference.Firebase_Create_Id, auth.getCurrentUser().getUid()).apply();
                            }
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            getDialog().dismiss();
                            Toast.makeText(getContext(), e.toString(), Toast.LENGTH_SHORT).show();
                        }
                    });
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                getDialog().dismiss();
            }
        });


    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == VideoPicker.VIDEO_PICKER_REQUEST_CODE && resultCode == RESULT_OK) {
            if (data != null) {
                List<String> mPaths = data.getStringArrayListExtra(VideoPicker.EXTRA_VIDEO_PATH);
                if (mPaths != null && mPaths.size() > 0) {
                    Utility.showLog("Video Success" + mPaths.get(0));
                    s3UploadRequest.setPath(mPaths.get(0));
                    startActivityForResult(new Intent(requireContext(), TrimmerActivity.class).putExtra(TrimmerActivity.EXTRA_VIDEO_PATH, mPaths.get(0)), TrimmerActivity.CODE);

                }
            }
        } else if (requestCode == TrimmerActivity.CODE && resultCode == RESULT_OK) {
            if (data != null) {
                String path = data.getStringExtra(TrimmerActivity.EXTRA_VIDEO_PATH);
                s3UploadRequest.setPath(path);
                String duration = Utility.convertMillieToHMmSs(Utility.getVideoDuration(path));
                Utility.showLog("Video Duration" + duration);//use this duration
                if (isVideoDuration(duration)) {
                    Utility.showLog("trimmed video " + path);
                    if (path != null) {
                        binding.videoView.setImageBitmap(Utility.getThumbnail(s3UploadRequest.getPath()));
                        binding.videoViews.setVisibility(View.VISIBLE);

                    }
                } else {
                    Utility.getAlertDialoge(requireContext(), "Video Not Supported", "Your offline pitch duration must be not more than 5 minutes.")
                            .setPositiveButton("Trim Previous Video Again", (dialog, which) -> {
                                dialog.dismiss();
                                startActivityForResult(new Intent(requireContext(), TrimmerActivity.class).putExtra(TrimmerActivity.EXTRA_VIDEO_PATH, s3UploadRequest.getPath()), TrimmerActivity.CODE);
                            })
                            .setNegativeButton("Select New", (dialog, which) -> {
                                dialog.dismiss();
                                Utility.showVidepPicker(requireActivity());

                            })
                            .show();
                }


            }
        }
    }

    private boolean isVideoDuration(String duration) {
        return (Integer.parseInt(duration.split(":")[0]) == 5 && Integer.parseInt(duration.split(":")[1]) == 0) ||
                (Integer.parseInt(duration.split(":")[0]) < 5);
    }
}
