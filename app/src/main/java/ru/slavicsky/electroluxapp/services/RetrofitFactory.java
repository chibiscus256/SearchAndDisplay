package ru.slavicsky.electroluxapp.services;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import ru.slavicsky.electroluxapp.AppConstants;

public class RetrofitFactory {
    public static OkHttpClient setInterceptor(){
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return new OkHttpClient.Builder().addInterceptor(interceptor).build();
    }

    public static Retrofit retrofit(){
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(AppConstants.baseURL)
                .client(setInterceptor())
                .addConverterFactory(MoshiConverterFactory.create());
        return builder.build();
    }

}
