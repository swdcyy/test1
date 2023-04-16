package ne1.h;
import n81.a;
import java.util.Collection;
import com.kuaishou.live.common.core.component.comments.display.config.LiveCommentsDisplayParams;
import com.kwai.feature.api.live.base.model.LiveCommentsFoldMessageConfig;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.String;
import java.util.List;
import com.kuaishou.live.core.show.comments.LiveCommentsAreaConfig;
import ne1.g;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCForbidComment;

public interface abstract h implements a	// class@0032ef
{

    void Cb(int p0,Collection p1);
    void E3();
    boolean Ho();
    void L7(boolean p0);
    void M3(LiveCommentsDisplayParams p0);
    void N1(LiveCommentsFoldMessageConfig p0);
    void Qm();
    boolean Tn(QLiveMessage p0,String p1);
    void Wl();
    void dd(List p0);
    void h6(LiveCommentsAreaConfig p0);
    int h8(boolean p0);
    long ki();
    void li(int p0);
    void lo(g p0);
    void m2(boolean p0);
    int pl(boolean p0);
    void s2(int p0);
    boolean ug(QLiveMessage p0,boolean p1);
    void vf(QLivePlayConfig p0);
    void yg(int p0);
    void zc(LiveStreamMessages$SCForbidComment p0);
}
