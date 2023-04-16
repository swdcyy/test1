package bw5.u;
import tkd.b;
import java.util.List;
import com.kwai.feature.api.social.message.imshare.model.IMShareRecoRequest;
import brd.a0;
import java.lang.String;
import brd.t;
import com.kwai.feature.api.social.message.imshare.model.IMShareRequest;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.imsdk.msg.KwaiMsg;
import zv5.h;
import zv5.b;
import java.lang.ref.WeakReference;
import zv5.i;

public interface abstract u implements b	// class@000627
{

    List AI();
    a0 Ai(IMShareRecoRequest p0);
    void C40(int p0,String p1,int p2);
    t Fe();
    void LB(IMShareRequest p0);
    void S40(GifshowActivity p0,IMShareRequest p1);
    t Sv();
    void cG(int p0,KwaiMsg p1);
    t fL(IMShareRequest p0);
    void fP(GifshowActivity p0,IMShareRequest p1);
    t hM(String p0);
    List hS(int p0);
    void hl(int p0,String p1,int p2,h p3);
    void lG(String p0,b p1);
    void mo(GifshowActivity p0,IMShareRequest p1);
    void rr(GifshowActivity p0,IMShareRequest p1);
    void vL(GifshowActivity p0,IMShareRequest p1,String p2,WeakReference p3);
    void vu(GifshowActivity p0,IMShareRequest p1,i p2);
    void xp(String p0,b p1);
}
