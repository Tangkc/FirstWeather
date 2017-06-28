package com.example.tangkc.firstcode.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Tangkc on 2017/6/27.
 */

public class HttpUtil {
   public static void sendOkHttpRequest(String address, Callback callback){
       OkHttpClient client=new OkHttpClient();
       Request request=new Request.Builder().url(address).build();
       client.newCall(request).enqueue(callback);

   }

}
