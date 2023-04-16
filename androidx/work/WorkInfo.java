package androidx.work.WorkInfo;
import java.util.UUID;
import androidx.work.WorkInfo$State;
import androidx.work.a;
import java.util.List;
import java.lang.Object;
import java.util.HashSet;
import java.util.Collection;
import java.lang.Class;
import java.util.Set;
import java.lang.Enum;
import java.lang.String;
import java.lang.StringBuilder;

public final class WorkInfo	// class@000a53
{
    public UUID a;
    public WorkInfo$State b;
    public a c;
    public Set d;
    public a e;
    public int f;

    public void WorkInfo(UUID p0,WorkInfo$State p1,a p2,List p3,a p4,int p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = new HashSet(p3);
       this.e = p4;
       this.f = p5;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       boolean b = false;
       if (p0 == null || WorkInfo.class != p0.getClass()) {
          return b;
       }
       if (this.f != p0.f) {
          return b;
       }
       if (!this.a.equals(p0.a)) {
          return b;
       }
       if (this.b != p0.b) {
          return b;
       }
       if (!this.c.equals(p0.c)) {
          return b;
       }
       if (!this.d.equals(p0.d)) {
          return b;
       }
       return this.e.equals(p0.e);
    }
    public int hashCode(){
       return ((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f);
    }
    public String toString(){
       return "WorkInfo{mId=\'"+this.a+'''+", mState="+this.b+", mOutputData="+this.c+", mTags="+this.d+", mProgress="+this.e+'}';
    }
}
