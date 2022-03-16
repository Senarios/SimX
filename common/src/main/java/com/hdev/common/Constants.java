package com.hdev.common;

import android.content.Context;



public interface Constants {
    //Animation Speed in ms
    int DURATION=500;
    String POST_IMAGE_URL="https://web.simx.tv/picture/";
    String DEFAULT_URL="https://web.simx.tv/";
    String DEFAULT_URL_PORT="http://web.simx.tv:90/";
    String BROADCASTER="Broadcaster";
    String VIEWER="Viewer";


    String ACCEPTED="accepted";
    String REJECTED="rejected";
    String OTHER_APPOINTMENT="Appointments You made";
    String SELF_APPOINTMENT="Appointments You have";

    //shared preference constants
    interface SharedPreference {
        String Preference = "SimX";
        int Preference_Mode = Context.MODE_PRIVATE;
        String Login_Boolean = "Login";
        String TYPE = "text_type";
        String ACCESS_TOKEN="Access_token";
        String Resource = "Resource";
        String LinkedIn_Code = "Code";
        String Linkedin_ID="id";
        String Fullname="fullname";
        String PASSWORD="password";
        String CONPASSWORD="conpassword";
        String Email="email";
        String Firebase_Create_Id="firebaseid";
        String LINKED_IN_LINK="linked_in_link";
        String HOURLY_RATE="hourly_rate";
        String USER="user";
        String FCM="fcm_id";
        String USER_TYPE="user_type";
        String QB_USER="qb_user_sp";
        String SUB_AWS="subscribed to aws";
        String B_LINKEDIN="linkedbolean";
        String B_TWITTER="twitterbolean";
        String iS_COMMENT="iscomment";
        String IMAGE_META="image_metadata";
        String ISUPLOADING="uploading video";
        String S3_REQUEST="pending s3 request";
        String ISCVUPLOADED="cvuploaded";
        String RECRUITER="recruiter";
        String JOB_HUNTER="jobhunter";
        String ACCOUNT_TYPE="acctype";
        String CALL_MSG="notify";
        String PIC_CV="picturecv";
    }

    interface QB_CREDENTIALS{
        //App credentials
        String APPLICATION_ID = "93413";
        String AUTH_KEY = "4u56uHSp5H8QA7X";
        String AUTH_SECRET = "87DTyXxGX24FQBZ";
        String ACCOUNT_KEY = "tqkLiAq3vQd1bmBzogvP";

//        String APPLICATION_ID = "45149";
//        String AUTH_KEY = "mOere5WH5Q-3AmU";
//        String AUTH_SECRET = "6nMf9ZvtNrZWgd9";
//        String ACCOUNT_KEY = "tqkLiAq3vQd1bmBzogvP";
    }


    interface CALL{
        String SESSION_DESCRIPTION="sessionDescription";
        String OPPONENTS="opponents";
        String CONFERENCE_TYPE = "conference_type";
        String HANG_UP_REASON = "hangup_reason";
        String REJECT_REASON = "reject_reason";
        String CALLER_NAME = "caller_name";
        String SESSION_ID = "sessionID";
        String START_CONVERSATION_REASON = "start_conversation_reason";
        String VIDEO="isvideo";
        String CALL_TIME="calltime";
        String ISOUTGOING="outgoing call";
    }

    interface QB{
        String QB_DEFAULT_PASSWORD="cyberscopetv_2018";
        String QB_FULL_NAME ="qb_fullname";
         String QB_ENVIRONMENT_DEVELOPMENT ="DEVELOPMENT";
         String QB_ENVIRONMENT_PRODUCTION ="PRODUCTION";
        String QB_INCOMING_CALL ="callincoming";
        String QB_OPEN_CALL="opencallactivity";
        String QB_CHAT_UNSUCCESSFUl ="chatnotlogged";
        String QB_CHAT_SUCCESS ="chatserviceloginsuccesfull";
        String QB_SIGNUP_SUCCESS ="qb_chat_success";
        String QB_USER_LOGIN ="qb_user_login";
        String QB_PASSWORD ="qb_user_password";
        String QB_PIC ="qb_pic";
        String QB_ID="qb_id";
        String QB_OPPONENT_USER ="opponent_qb_user";
    }


    //linked_in
    interface LinkedIn{
        String FindProfile= "https://www.linkedin.com/help/linkedin/answer/49315/finding-your-linkedin-public-profile-url";
        String V2_API="https://api.linkedin.com/v2/";
        String Base_Access_Token="https://www.linkedin.com/oauth/v2/";
        String responseType = "code";
        String redirectURL= "https://www.cyberjobscope.com/signin-linkedin";
        String Url ="https://www.linkedin.com/oauth/v2/authorization";
        String clientId = "86ld41cejbmt12";
        String clientSecret = "jIQKHKfWKMOSYgQT";
        String state = "DLKDJF46ikMMZADfdfds";
        String scope ="r_liteprofile%20r_emailaddress";
        String grantType = "authorization_code";
//        String scope = "r_liteprofile%20r_emailaddress%20w_member_social%20rw_company_admin%20w_share";


    }


    //Twitter
    interface Twitter{
        String consumerKey      = "L0L0uFZnt0H2PSZWvW2NL9Yje";
        String consumerSecret   = "e6BmRjuNHtdERCcds9yL0LJQwRVsAqf0zk4zzzZcOoUJaBoJj3";
        String TWITTER_USER_ID  = "TWITTER_USER_ID";
        String CallBackURL      = "https://www.cyberjobscope.com?source=twitter";
        String BASE_URL="https://api.twitter.com/oauth/";
        String AUTH_WEB_URL="https://api.twitter.com/oauth/authorize?";
        String AUTH2_TOKEN="Authorization: Bearer AAAAAAAAAAAAAAAAAAAAAFr%2F0QAAAAAATBy%2FxRYJnmLSV76552NmBroles8%3DtdgM3z8nRVoKmYRkQNcDkjKStuMcTScndN9Zr9DCB03DoT8VJg";
        String POST_STREAM_URL="https://api.twitter.com/1.1/statuses/";


    }

    interface AUTH{
        //auth keys for request
        String AUTH_VERIFIER="oauth_verifier";
        String AUTH_TOKEN="oauth_token";
        String AUTH_CONSUMER="oauth_consumer_key";
        String AUTH_CALLBACK="oauth_callback";
        String USER_AUTH_TOKEN="oauth_token";
        String USER_AUTH_SECRET="oauth_token_secret";
        String USER_ID="user_id";
        String SCREEN_NAME="screen_name";

    }

    interface GoCoder {
        String PUBLISH_VIDEO="web.simx.tv";
        String OFFLINE="offline";
        String ONLINE="online";
        String RTMP_URL="rtmp://simx.tv:1935/live/";
    }

    interface Paypal{
        String BASE_URL = "https://api.sandbox.paypal.com/v1/";
                //"https://api-m.paypal.com";
        String GRANT_TYPE="client_credentials";
        //URL for paypal
        String PP_URL = "https://www.paypal.com/webapps/mpp/ua/privacy-full";
        String UA_URL = "https://www.paypal.com/webapps/mpp/ua/useragreement-full";

      //Sandbox ids for Paypal
        String S_CLIENT_ID = "AeeMZl59QsbKaP7mUbIY9ftucUf9lLs35HZLhG6DyCNpZeMLFO-f1eieOAghLJeV8jR9odoX01DTa1g-";
        String S_SECRET = "EGvEXzqAZA1H1vz9cwZUJzR1rDbbmcC29tjdQ4cAUCisPyuZMaE8hB0qPw62HGvpPfBSrlUbDXXIVmze";

       //production ids for paypal
        String P_CLIENT_ID = "AZ39GzkBvS63mnrBjeeMX_N0CavdsuxJLEhxyfVReNIp0RzYFJ6P6HytKrAaUHwzot2kExoEsGVfJePV";
        String P_SECRET = "EDwz4TO5mZqhiwHiUy4NfTn3dEWm6a0ccLFb21cTEbJaRkdvFGUKexHHMFIwDlEBBeNfAUgd5hRRfgPG";
    }

    interface DreamFactory {
        String URL = "http://54.70.143.84:90/api/v2/";

        String PAGINATION ="?offset=10&limit=10&order=id%20desc";
        String ORDERBY ="id desc";
        String ORDERBYBC ="id asc";
        String BROADCAST_RELATED="jobcandidates_by_broadcast,users_by_username,tags_by_broadcast";
        String RATINGS_RELATED="users_by_userId";
        String USERNAME_RELATED="users_by_username,broadcasts_by_broadcast,videocvs_by_videocvID";
        String TAG_RELATED="tags_by_broadcast";
        String CV_RELATED="videocvs_by_username";
        String API_KEY="88f4e742f60f801b195bb510c533d01bc4470717f4bb5f8195a8429111735a90";

        String WEB_SHARE_URL="https://h2startup.com/stream/index2.php?v=";
        String TYPE_offline="&type=offline";
        String TYPE_RECORDED ="&type=recorded";
        // -  - // "mysql/_table"
        String GET_BROADCASTS = "mysql/_table/broadcasts";
        String GET_FOLLOWERS = "mysql/_table/followers";
        String GET_APPOINTMENTS = "mysql/_table/appointments";
        String GET_USERS =      "mysql/_table/users";
        String GET_CAllRECORDS =  "mysql/_table/calls_records";
        String GET_BlOCKED = "mysql/_table/blockedusers";

        String GET_IMAGE_URL="https://web.simx.tv/picture/Photos/";

        String baseLinkForStreamThmbNails = "https://web.simx.tv/picture/Photos/";
        String liveStreamViewerUrl = "https://web.simx.tv:1935/live/";
        String liveStreamBrodacsterUrl = "rtmp://web.simx.tv:1935/live/";
        String savedStreamUrl = "https://web.simx.tv:1935/vod/";
        String savedStreamPostFix = "mp4./playlist.m3u8";
        String liveStreamPostFix = "/playlist.m3u8";
//        String savedStreamPostFix = "mp4./playlist.m3u8";




    }


    interface Messages{
        String PLAY_SERVICE_ERROR_TITLE="Play Services Not Found";
        String PLAY_SERVICES_ERROR="Please update or install play services on your smart phone";
        String SIGN_IN_QB_CHAT="Logging into Chat Service...";
        String FETCH_CONVERSATIONS="Fetching Conversations...";
        String CREDITS_ERROR="You don't have enough credit! Please recharge your account.";
        String NETWORK_ERROR="Enable Data/Wifi";
        String ERROR="Something went wrong..";
        String Success="Successfull";
        String QB_SIGNUP_EXCEPTION="com.quickblox.core.exception.QBResponseException: login has already been taken";
        String PERMISSION="You need to grant these permissions otherwise the app will not work properly";
    }

    interface DataConstants{
        String USER="USER_DATA";
        String USER_ID="id";
        String TYPE="typeoffollow";
        String FOLLOWER="follow_following data";
    }

    interface Endpoints{
        String POST_DP="test.php";
        String BROADCASTS ="mysql/_table/broadcasts";
        String RATINGS ="mysql/_table/ratings";
        String POST_LIVE_THUMBNAIL="uploadvideoapi.php";
        String POST_USER="mysql/_table/users";
        String S3THUMBNAIL="s3test.php";
        String GET_JOB_CANDIDATES="mysql/_table/jobcandidates";
        String POST_JOB_CANDIDATES="mysql/_table/jobcandidates";
        String FOLLOWERS = "mysql/_table/followers";
        String DELETE_BROADCAST="admin/deletefromserver.php";
        String DELETE_TAGS="admin/deletefromserver.php";
        String TAGS = "mysql/_table/tags";
        String SEARCH="searchbytags.php";
        String VIDEOCV="mysql/_table/videocvs";
    }

    interface S3Constants{
        String S3_BUCKET="simx";
        String OFFLINE_VIDEO_FOLDER="offlineVideos";
        String VIDEO_CV_FOLDER="videoCvs";
        String RECORDED_VIDEO_FOLDER="recordedvideos";
        String OTHER="Other";
        String DEMO="demo.mp4";
        String LINK="link.mp4";
    }

    interface EventBusKeys{
        String BLOCKED="blocked_event_bus";
        String FOLLOWERS="followers_event_bus";

    }



}
