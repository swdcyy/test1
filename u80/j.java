package u80.j;
import tkd.b;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.String;
import brd.t;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import java.lang.Runnable;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import u80.d;
import java.util.List;
import android.content.Context;
import com.kuaishou.gifshow.kuaishan.KSSource;
import com.kwai.feature.post.api.feature.memory.MemorySceneType;
import java.util.ArrayList;
import n3d.a;
import java.lang.Throwable;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kwai.feature.post.api.feature.kuaishan.model.KuaishanPageParam;
import mm6.c;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult;
import rk7.a;

public interface abstract j implements b	// class@002d69
{

    boolean AL(c p0);
    byte[] C00(byte[] p0);
    t G30(String p0);
    boolean JN();
    t L3(GifshowActivity p0,String p1,String p2);
    void Lt(Activity p0,Runnable p1,Runnable p2);
    t MJ(int p0);
    String NF(String p0);
    boolean TT(KSTemplateDetailInfo p0);
    void Xr(Activity p0,Runnable p1,Runnable p2,String p3,String p4);
    t cc(d p0,List p1,String p2,boolean p3);
    t d60(Context p0,KSTemplateDetailInfo p1,String p2,List p3,KSSource p4,boolean p5,MemorySceneType p6);
    t e20(String p0,String p1);
    t eZ(String p0,KSTemplateDetailInfo p1,boolean p2);
    int fX();
    void fd();
    void fy(GifshowActivity p0,d p1,ArrayList p2,boolean p3,a p4);
    void g40(String p0);
    t gt(String p0,String p1);
    void iy(GifshowActivity p0,Throwable p1);
    byte[] ld(byte[] p0);
    boolean oT(KSTemplateDetailInfo p0);
    void pC(Activity p0,d p1,VideoContext p2,boolean p3);
    t rz(String p0,String p1,List p2);
    c uH(KuaishanPageParam p0);
    t wp(EditorSdk2MvCreationResult p0,KSTemplateDetailInfo p1,List p2,KSSource p3);
    boolean wv();
    a xY(String p0);
    d yK(String p0,String p1,EditorSdk2MvCreationResult p2);
    t yg(int p0);
}
