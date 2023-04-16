package fs3.c;
import tkd.b;
import androidx.fragment.app.KwaiDialogFragment;
import android.net.Uri;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import ds3.a;
import ds3.l;
import java.lang.String;
import crd.b;
import brd.t;
import java.util.HashMap;
import ds3.m;
import java.util.List;
import androidx.fragment.app.Fragment;
import android.content.Context;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.feed.BaseFeed;
import fs3.c$c;
import com.kuaishou.merchant.api.core.model.MerchantInfo;
import fs3.c$a;
import com.kwai.framework.init.a;
import fs3.c$b;
import ks3.k0;
import ks3.e;
import ks3.x;
import ks3.l;

public interface abstract c implements b	// class@00293c
{

    void Ak(KwaiDialogFragment p0,Uri p1);
    KwaiDialogFragment FX(LiveMerchantBaseContext p0);
    String HQ(a p0,l p1);
    b IV(a p0,l p1);
    t TZ(String p0,String p1,String p2,String p3);
    void UR(String p0);
    b V0(String p0,int p1,String p2,long p3,String p4);
    t a7(String p0,String p1,HashMap p2);
    t b0(String p0,String p1);
    KwaiDialogFragment cp(a p0,l p1,m p2);
    KwaiDialogFragment hL(a p0,l p1);
    List hj();
    void j2(String p0);
    boolean jQ(String p0);
    Fragment ko(String p0);
    b lj(Context p0,LiveMerchantBaseContext p1,int p2);
    void r40(ClientContent$LiveStreamPackage p0,GifshowActivity p1,BaseFeed p2,c$c p3);
    Fragment sf(LiveMerchantBaseContext p0,MerchantInfo p1,c$a p2,String p3);
    a xz();
    Fragment yH(LiveMerchantBaseContext p0,c$b p1,k0 p2,e p3,x p4,l p5,c$a p6);
}
