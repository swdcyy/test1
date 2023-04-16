package com.kuaishou.live.core.basic.bulletin.BulletinUtils$CommentHeightConfig$Config;
import java.io.Serializable;
import com.kuaishou.live.core.basic.bulletin.BulletinUtils$CommentHeightConfig$Config$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class BulletinUtils$CommentHeightConfig$Config implements Serializable	// class@000819
{
    public final float commentHeightDp;
    public final float screenMinHeightDp;
    public static final BulletinUtils$CommentHeightConfig$Config$a Companion;
    public static final long serialVersionUID;

    static {
       BulletinUtils$CommentHeightConfig$Config.Companion = new BulletinUtils$CommentHeightConfig$Config$a(null);
    }
    public void BulletinUtils$CommentHeightConfig$Config(){
       super(0, 0, 3, null);
    }
    public void BulletinUtils$CommentHeightConfig$Config(float p0,float p1){
       super();
       this.screenMinHeightDp = p0;
       this.commentHeightDp = p1;
    }
    public void BulletinUtils$CommentHeightConfig$Config(float p0,float p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = 0;
       }
       if (p2 & 0x02) {
          p1 = 0;
       }
       super(p0, p1);
       return;
    }
    public static BulletinUtils$CommentHeightConfig$Config copy$default(BulletinUtils$CommentHeightConfig$Config p0,float p1,float p2,int p3,Object p4){
       BulletinUtils$CommentHeightConfig$Config screenMinHei;
       BulletinUtils$CommentHeightConfig$Config commentHeigh;
       if (p3 & 0x01) {
          screenMinHei = p0.screenMinHeightDp;
       }
       if (p3 & 0x02) {
          commentHeigh = p0.commentHeightDp;
       }
       return p0.copy(screenMinHei, commentHeigh);
    }
    public final float component1(){
       return this.screenMinHeightDp;
    }
    public final float component2(){
       return this.commentHeightDp;
    }
    public final BulletinUtils$CommentHeightConfig$Config copy(float p0,float p1){
       if (PatchProxy.isSupport(BulletinUtils$CommentHeightConfig$Config.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, BulletinUtils$CommentHeightConfig$Config.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new BulletinUtils$CommentHeightConfig$Config(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BulletinUtils$CommentHeightConfig$Config.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof BulletinUtils$CommentHeightConfig$Config && (!Float.compare(this.screenMinHeightDp, p0.screenMinHeightDp) && !Float.compare(this.commentHeightDp, p0.commentHeightDp)))) {
          return true;
       }
       return false;
    }
    public final float getCommentHeightDp(){
       return this.commentHeightDp;
    }
    public final float getScreenMinHeightDp(){
       return this.screenMinHeightDp;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, BulletinUtils$CommentHeightConfig$Config.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((Float.floatToIntBits(this.screenMinHeightDp) * 31) + Float.floatToIntBits(this.commentHeightDp));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, BulletinUtils$CommentHeightConfig$Config.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Config\(screenMinHeightDp="+this.screenMinHeightDp+", commentHeightDp="+this.commentHeightDp+"\)";
    }
}
