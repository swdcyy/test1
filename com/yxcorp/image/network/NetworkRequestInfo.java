package com.yxcorp.image.network.NetworkRequestInfo;
import java.lang.Object;

public class NetworkRequestInfo	// class@001a1b
{
    public long mCallEnd;
    public long mCallStart;
    public long mConnectCost;
    public long mConnectStart;
    public String mContentSubType;
    public String mContentType;
    public long mDnsCost;
    public long mDnsStart;
    public String mDownloadStatus;
    public String mErrorMessage;
    public int mHttpCode;
    public long mNetworkCost;
    public String mProtocol;
    public long mQueueCost;
    public long mReceivedSize;
    public long mReleaseCost;
    public String mRemoteIp;
    public long mRequestCost;
    public long mRequestEnd;
    public String mRequestId;
    public long mRequestStart;
    public long mResponseCost;
    public long mResponseEnd;
    public long mResponseStart;
    public String mStatus;
    public String mUrl;
    public long mWaitingResponseCost;
    public static final String S_UNSET = "";
    public static final int UNSET = 255;

    public void NetworkRequestInfo(){
       super();
       this.mStatus = "";
       this.mDownloadStatus = "";
       this.mCallStart = -1;
       this.mQueueCost = -1;
       this.mDnsStart = -1;
       this.mDnsCost = -1;
       this.mConnectStart = -1;
       this.mConnectCost = -1;
       this.mRequestStart = -1;
       this.mRequestEnd = -1;
       this.mRequestCost = -1;
       this.mResponseStart = -1;
       this.mWaitingResponseCost = -1;
       this.mResponseCost = -1;
       this.mCallEnd = -1;
       this.mResponseEnd = -1;
       this.mReleaseCost = -1;
       this.mUrl = "";
       this.mNetworkCost = -1;
       this.mRemoteIp = "";
       this.mHttpCode = -1;
       this.mErrorMessage = "";
       this.mReceivedSize = -1;
       this.mRequestId = "";
       this.mProtocol = "";
       this.mContentType = "";
       this.mContentSubType = "";
    }
}
