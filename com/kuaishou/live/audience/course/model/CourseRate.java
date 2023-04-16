package com.kuaishou.live.audience.course.model.CourseRate;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class CourseRate implements Serializable	// class@000c0b
{
    public boolean mChecked;
    public String mCheckedImgUrl;
    public String mEvaluate;
    public int mId;
    public String mUnCheckedImgUrl;
    public String mValue;
    public static final long serialVersionUID = 0x23c8d8938c406347;

    public void CourseRate(int p0,String p1,String p2,String p3,String p4){
       super();
       this.mId = p0;
       this.mValue = p1;
       this.mEvaluate = p2;
       this.mCheckedImgUrl = p3;
       this.mUnCheckedImgUrl = p4;
    }
}
