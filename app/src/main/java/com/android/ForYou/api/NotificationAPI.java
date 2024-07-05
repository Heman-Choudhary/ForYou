package com.android.ForYou.api;

import com.android.ForYou.model.NotificationSenderModel;
import com.android.ForYou.util.NotificationResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface NotificationAPI {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAhZGT018:APA91bH9VjzwMcLxUSjNikPcCEvyJzsvWLiLscG7Sd-Pj3A2wrGsyTVWGaK_0bTjpcYvyaxuviOZlWQiZtebHXpiXSKzZkSpKiclzB7h_vn5sERCCn5V7yinAUk4s4CM_Ybt1cH8Bvw-" // Replace with your server key from Firebase Console
            }
    )

    @POST("fcm/send")
    Call<NotificationResponse> sendNotification(@Body NotificationSenderModel body);
}
