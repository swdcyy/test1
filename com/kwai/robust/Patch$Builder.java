package com.kwai.robust.Patch$Builder;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.Patch;
import java.lang.String;
import com.kwai.robust.Patch$a;

public final class Patch$Builder	// class@0013f3
{
    public String mApplyTime;
    public Object mExtra;
    public String mFeatureName;
    public String mFeatureVersion;
    public String mId;
    public String mImplClassName;
    public String mLocalPath;
    public String mMd5;
    public String mNativeInstallPath;
    public String mRobustId;

    public void Patch$Builder(){
       super();
       this.mImplClassName = "com.kwai.robust.patch.PatchesInfoImpl";
    }
    public static Patch$Builder patch(){
       return new Patch$Builder();
    }
    public static Patch$Builder patch(Class p0){
       return new Patch$Builder();
    }
    public Patch build(){
       Patch patch = new Patch(this.mImplClassName, this.mId, this.mLocalPath, this.mMd5, this.mRobustId, this.mExtra, this.mNativeInstallPath, this.mApplyTime, this.mFeatureName, this.mFeatureVersion, null);
       return v12;
    }
    public Patch$Builder but(){
       return new Patch$Builder().withImplClassName(this.mImplClassName).withId(this.mId).withLocalPath(this.mLocalPath).withMd5(this.mMd5).withRobustId(this.mRobustId).withExtra(this.mExtra).withNativeInstallPath(this.mNativeInstallPath).withApplyTime(this.mApplyTime).withFeatureName(this.mFeatureName).withFeatureVersion(this.mFeatureVersion);
    }
    public Patch$Builder withApplyTime(String p0){
       this.mApplyTime = p0;
       return this;
    }
    public Patch$Builder withExtra(Object p0){
       this.mExtra = p0;
       return this;
    }
    public Patch$Builder withFeatureName(String p0){
       this.mFeatureName = p0;
       return this;
    }
    public Patch$Builder withFeatureVersion(String p0){
       this.mFeatureVersion = p0;
       return this;
    }
    public Patch$Builder withId(String p0){
       this.mId = p0;
       return this;
    }
    public Patch$Builder withImplClassName(String p0){
       this.mImplClassName = p0;
       return this;
    }
    public Patch$Builder withLocalPath(String p0){
       this.mLocalPath = p0;
       return this;
    }
    public Patch$Builder withMd5(String p0){
       this.mMd5 = p0;
       return this;
    }
    public Patch$Builder withNativeInstallPath(String p0){
       this.mNativeInstallPath = p0;
       return this;
    }
    public Patch$Builder withRobustId(String p0){
       this.mRobustId = p0;
       return this;
    }
}
