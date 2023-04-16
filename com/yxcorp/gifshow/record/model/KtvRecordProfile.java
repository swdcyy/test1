package com.yxcorp.gifshow.record.model.KtvRecordProfile;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class KtvRecordProfile implements Serializable	// class@001793
{
    public long mAllReadyTime;
    public long mBeginWriteTime;
    public long mClickRecordBtnTime;
    public long mFirstIjkPcmTime;
    public long mFirstRecorderFrameTime;
    public long mIjkStartPlayTime;

    public void KtvRecordProfile(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KtvRecordProfile.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "\n"+"1.���¼��"+this.mClickRecordBtnTime+"\n"+"2.AudioTrack�õ���һ֡"+this.mFirstRecorderFrameTime+"\n"+"3.IJK��ʼ����"+this.mIjkStartPlayTime+"\n"+"4.IJK�õ���һ֡"+this.mFirstIjkPcmTime+"\n"+"5.IJK�õ���һ֡, Ҳ���ŵ���ȷλ���ˣ���ʼ¼��"+this.mAllReadyTime+"\n"+"6.��ʼд�ļ�ʱ��"+this.mBeginWriteTime+"\n"+"1-2 cost "+(this.mFirstRecorderFrameTime - this.mClickRecordBtnTime)+"\n"+"2-3 cost "+(this.mIjkStartPlayTime - this.mFirstRecorderFrameTime)+"\n"+"3-4 cost "+(this.mFirstIjkPcmTime - this.mIjkStartPlayTime)+"\n"+"4-5 cost "+(this.mAllReadyTime - this.mFirstIjkPcmTime)+"\n"+"5-6 cost "+(this.mBeginWriteTime - this.mAllReadyTime);
    }
}
