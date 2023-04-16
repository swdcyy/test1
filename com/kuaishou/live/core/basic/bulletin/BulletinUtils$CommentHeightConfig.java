package com.kuaishou.live.core.basic.bulletin.BulletinUtils$CommentHeightConfig;
import java.io.Serializable;
import com.kuaishou.live.core.basic.bulletin.BulletinUtils$CommentHeightConfig$a;
import nsd.u;
import java.util.List;
import java.lang.Object;

public final class BulletinUtils$CommentHeightConfig implements Serializable	// class@00081b
{
    public final List config;
    public static final BulletinUtils$CommentHeightConfig$a Companion;
    public static final long serialVersionUID;

    static {
       BulletinUtils$CommentHeightConfig.Companion = new BulletinUtils$CommentHeightConfig$a(null);
    }
    public void BulletinUtils$CommentHeightConfig(){
       super(null, 1, null);
    }
    public void BulletinUtils$CommentHeightConfig(List p0){
       super();
       this.config = p0;
    }
    public void BulletinUtils$CommentHeightConfig(List p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = null;
       }
       super(p0);
       return;
    }
    public final List getConfig(){
       return this.config;
    }
}
