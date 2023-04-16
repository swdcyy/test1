package ui9.j;
import com.yxcorp.gifshow.camerasdk.magicface.ILiveImageHelper;
import xi9.b;
import xi9.j;
import xi9.n;
import xi9.f;
import xi9.r;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicLoadEffectFailedListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicBoomGameListener;
import ui9.e;
import ui9.f;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicMagicAlbumListener;
import java.lang.String;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicExpressionListener;
import com.kwai.video.westeros.models.EffectType;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicBodySlimmingListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicPortraitListener;
import ui9.b;
import ui9.c;

public interface abstract j implements ILiveImageHelper, b, j, n, f, r	// class@003d8c
{

    void A0(FaceMagicController$FaceMagicLoadEffectFailedListener p0);
    void E0(FaceMagicController$FaceMagicBoomGameListener p0);
    void G0(e p0);
    void H0(f p0);
    void I(FaceMagicController$FaceMagicMagicAlbumListener p0);
    void I0(boolean p0);
    void J0(boolean p0);
    void L0(FaceMagicController$FaceMagicBoomGameListener p0);
    void M(String p0);
    void M0();
    void N0(String p0,FaceMagicController$FaceMagicExpressionListener p1);
    f O0();
    void Q0(EffectType p0,boolean p1);
    void R0(FaceMagicController$FaceMagicBodySlimmingListener p0);
    void S0();
    void T0(boolean p0,boolean p1,boolean p2,boolean p3);
    void V0(FaceMagicController$FaceMagicPortraitListener p0);
    void Y0(b p0);
    void Z0(c p0);
    boolean l0(String p0);
    void n0(FaceMagicController$FaceMagicLoadEffectFailedListener p0);
    void release();
    void stop();
}
