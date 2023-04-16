package wj2.r0;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import tx1.d;
import android.os.Bundle;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams;
import wj2.m0;
import tx1.b;
import java.lang.String;
import com.kuaishou.live.gzone.v2.profile.LiveGzoneProfileParams;

public interface abstract r0	// class@0049bd
{

    void a(UserProfile p0,LiveStreamClickType p1,int p2,boolean p3,d p4,int p5);
    void b(UserProfile p0,LiveStreamClickType p1,int p2,boolean p3,int p4,Bundle p5);
    void c(UserProfile p0,LiveStreamClickType p1,int p2,boolean p3,d p4,int p5,LiveFollowExtParams p6);
    boolean d();
    void e(UserProfile p0,LiveStreamClickType p1,int p2,boolean p3,int p4,LiveFollowExtParams p5);
    void f(UserProfile p0,LiveStreamClickType p1,int p2,boolean p3,int p4,boolean p5,m0 p6);
    void g(UserProfile p0,LiveStreamClickType p1,int p2,boolean p3,int p4,LiveFollowExtParams p5,b p6);
    LiveGzoneProfileParams h(UserProfile p0,LiveStreamClickType p1,int p2,String p3,boolean p4,int p5);
    void i();
    void j(UserProfile p0,LiveStreamClickType p1,int p2,boolean p3,d p4,int p5,boolean p6);
    void k(UserProfile p0,LiveStreamClickType p1,int p2,String p3,boolean p4,int p5,b p6);
    void w0(UserProfile p0,LiveStreamClickType p1,int p2,boolean p3,int p4);
}
