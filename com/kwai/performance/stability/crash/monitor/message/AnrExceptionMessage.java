package com.kwai.performance.stability.crash.monitor.message.AnrExceptionMessage;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import java.lang.String;
import vg7.h;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import vg7.d;
import com.kwai.performance.stability.crash.monitor.message.AnrReason;
import java.lang.Class;
import java.lang.Object;
import com.google.gson.Gson;
import java.lang.Exception;

public final class AnrExceptionMessage extends ExceptionMessage	// class@0011ef
{
    public String mAnrForeground;
    public String mAnrHideErrorDialogs;
    public String mAnrInputMethodExists;
    public String mAnrShowBackground;
    public String mCostInfo;
    public long mDumpUnixTime;
    public long mDumpUptimeMillis;
    public String mExtraInfo;
    public String mMessageQueueDetail;
    public int mQueueBarrier;
    public String mReason;
    public String mShowAnrDialog;
    public String mThreadDetail;
    public String mThreadStatus;
    public int mTraversalBarrier;
    public static final long serialVersionUID = 0xe419a2fe4c8d3476;

    public void AnrExceptionMessage(){
       super();
       this.mReason = "";
       this.mMessageQueueDetail = "";
       this.mDumpUptimeMillis = -1;
       this.mDumpUnixTime = -1;
       this.mThreadDetail = "";
       this.mThreadStatus = "";
       this.mShowAnrDialog = "Unknown";
       this.mAnrForeground = "Unknown";
       this.mAnrShowBackground = "Unknown";
       this.mAnrHideErrorDialogs = "Unknown";
       this.mAnrInputMethodExists = "Unknown";
       this.mExtraInfo = "{}";
       this.mCostInfo = "Unknown";
       this.mTraversalBarrier = -1;
       this.mQueueBarrier = -1;
    }
    public String getTypePrefix(){
       return "ANR_";
    }
    public String toString(){
       StringBuilder str = new h().a();
       try{
          str = str+super.toString();
          if (!TextUtils.isEmpty(this.mReason)) {
             str = str+"ANR ԭ��:\n"+d.j.h(this.mReason, AnrReason.class)+"\n";
          }
          String str1 = "�߳�״̬: \n";
          if (!TextUtils.isEmpty(this.mThreadStatus)) {
             str = str+str1+this.mThreadStatus+"\n";
          }
          if (!TextUtils.isEmpty(this.mThreadDetail)) {
             str = str+str1+this.mThreadDetail+"\n";
          }
          if (!TextUtils.isEmpty(this.mMessageQueueDetail)) {
             str = str+"��Ϣ����: \n"+this.mMessageQueueDetail+"\n"+"��Ϣ����Dumpʱ��: "+this.mDumpUptimeMillis+", "+this.mDumpUnixTime+"\n";
          }
          str = str+"ViewRoot �� Token: "+this.mTraversalBarrier+", ���������� Token: "+this.mQueueBarrier+"\n"+"\n"+"ANR����:"+this.mShowAnrDialog+"\n"+"��ʷ��Ϣ����: ";
          String str2 = (("{}").equals(this.mExtraInfo))? "��": "��";
          str = str+str2;
          str2 = (this.mExtraInfo != null)? ", Length = "+(this.mExtraInfo).length(): "";
          str = str+str2+"\n"+"--------------\n"+"ǰ̨:"+this.mAnrForeground+"\n"+"�����뷨:"+this.mAnrInputMethodExists+"\n"+"��̨�ɵ���:"+this.mAnrShowBackground+"\n"+"���ر�����:"+this.mAnrHideErrorDialogs+"\n"+"\n";
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
       }
       return str.substring(0);
    }
}
