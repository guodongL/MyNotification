package com.example.administrator.mynotification;

/**
 * Created by Administrator on 2018/9/27.
 */

public interface UpdateDownloadListener {
    public void onStarted();
    public void onProgressChanged(int progress, String downloadUrl);
    public void onFinished(float completeSize, String downloadUrl);
    public void onFailure();

}
