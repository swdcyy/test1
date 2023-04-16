package t7.a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class a	// class@002470
{
    public final boolean mBadge;
    public final boolean mBubble;
    public final String mDescription;
    public final String mId;
    public final int mImportance;
    public final boolean mLight;
    public final boolean mLockVisibility;
    public final String mName;
    public final boolean mPassDnd;
    public final String mSoundId;
    public final boolean mVibrate;

    public final boolean a(){
       return this.mBadge;
    }
    public final boolean b(){
       return this.mBubble;
    }
    public final String c(){
       return this.mDescription;
    }
    public final String d(){
       return this.mId;
    }
    public final int e(){
       return this.mImportance;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof a && (a.g(this.mName, p0.mName) && (a.g(this.mId, p0.mId) && (this.mVibrate == p0.mVibrate && (this.mLight == p0.mLight && (this.mImportance == p0.mImportance && (this.mLockVisibility == p0.mLockVisibility && (this.mPassDnd == p0.mPassDnd && (this.mBadge == p0.mBadge && (a.g(this.mSoundId, p0.mSoundId) && (a.g(this.mDescription, p0.mDescription) && this.mBubble == p0.mBubble)))))))))))) {
          return true;
       }
       return false;
    }
    public final boolean f(){
       return this.mLight;
    }
    public final boolean g(){
       return this.mLockVisibility;
    }
    public final String h(){
       return this.mName;
    }
    public int hashCode(){
       a tmName = this.mName;
       int i = 0;
       int i1 = (tmName != null)? tmName.hashCode(): 0;
       i1 = i1 * 31;
       a tmId = this.mId;
       int i2 = (tmId != null)? tmId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmId = this.mVibrate;
       int i3 = 1;
       if (tmId != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tmId = this.mLight;
       if (tmId != null) {
          i2 = 1;
       }
       i1 = (((i1 + i2) * 31) + this.mImportance) * 31;
       tmId = this.mLockVisibility;
       if (tmId != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tmId = this.mPassDnd;
       if (tmId != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tmId = this.mBadge;
       if (tmId != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tmId = this.mSoundId;
       i2 = (tmId != null)? tmId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmId = this.mDescription;
       if (tmId != null) {
          i = tmId.hashCode();
       }
       i1 = (i1 + i) * 31;
       a tmBubble = this.mBubble;
       if (tmBubble == null) {
          i3 = tmBubble;
       }
       return (i1 + i3);
    }
    public final boolean i(){
       return this.mPassDnd;
    }
    public final String j(){
       return this.mSoundId;
    }
    public final boolean k(){
       return this.mVibrate;
    }
    public String toString(){
       return "AllowChannelInfo\(mName="+this.mName+", mId="+this.mId+", mVibrate="+this.mVibrate+", mLight="+this.mLight+", mImportance="+this.mImportance+", mLockVisibility="+this.mLockVisibility+", mPassDnd="+this.mPassDnd+", mBadge="+this.mBadge+", mSoundId="+this.mSoundId+", mDescription="+this.mDescription+", mBubble="+this.mBubble+"\)";
    }
}
