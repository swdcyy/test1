package com.kwai.yoda.model.PullDownTypeParams;
import java.io.Serializable;
import java.lang.Object;

public class PullDownTypeParams implements Serializable	// class@0012c4
{
    public String mBehavior;
    public String mLoadFailIcon;
    public String mLoadFailText;
    public String mLoadSuccessIcon;
    public String mLoadSuccessText;
    public String mLoadingIcon;
    public String mLoadingText;
    public String mPullContinueIcon;
    public String mPullContinueText;
    public String mPullStartIcon;
    public String mPullStartText;
    public int mThreshold;

    public void PullDownTypeParams(){
       super();
       this.mPullStartText = "��������ˢ��";
       this.mPullContinueText = "�ɿ�����ˢ��";
       this.mLoadingText = "Ŭ��������";
       this.mLoadSuccessText = "���سɹ�";
       this.mLoadFailText = "����ʧ��";
    }
}
