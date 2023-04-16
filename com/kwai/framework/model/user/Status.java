package com.kwai.framework.model.user.Status;
import java.io.Serializable;
import java.lang.Object;

public class Status implements Serializable	// class@00172c
{
    public boolean mFaceDetection;
    public List mMoodIcon;
    public String mMoodSubTitle;
    public List mMoodTemplatePreview;
    public String mMoodTitle;
    public int mMoodType;
    public HashMap mServerParams;
    public int mViewType;
    public static final long serialVersionUID = 0x519867f3b5c32a69;

    public void Status(){
       super();
    }
}
