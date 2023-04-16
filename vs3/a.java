package vs3.a;
import tkd.b;
import android.content.Context;
import java.lang.String;
import android.os.Bundle;
import java.util.Map;
import com.kuaishou.merchant.api.router.FragmentConfig;
import us3.i;
import android.app.Activity;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import androidx.fragment.app.c;
import z1.k;
import android.content.Intent;
import com.kwai.framework.init.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import us3.f;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.merchant.basic.model.MerchantTrilateralUrlWhiteListModel;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import us3.c;

public interface abstract a implements b	// class@00434b
{

    i Ew(Context p0,String p1,Bundle p2,Map p3,FragmentConfig p4);
    void Gn(Activity p0,String p1,LiveMerchantBaseContext p2);
    boolean I30(Activity p0);
    c LD(c p0,k p1);
    void LK(Activity p0,String p1,boolean p2);
    void RP(Activity p0,String p1);
    Intent SL(Activity p0,String p1,String p2,String p3);
    boolean TW(Activity p0,String p1);
    a UI();
    i X00(Fragment p0,int p1,String p2,String p3,boolean p4);
    void XZ(Activity p0,String p1);
    i Yr(Context p0,String p1,Bundle p2,Map p3,FragmentConfig p4);
    boolean Yv(String p0);
    void ZB(Intent p0,Activity p1);
    void a30(Activity p0,String p1);
    KwaiDialogFragment aV(FragmentActivity p0,String p1,Map p2,f p3);
    void eg(c p0,int p1,Fragment p2,String p3);
    KwaiDialogFragment nl(FragmentActivity p0,String p1,Map p2);
    void p60(Activity p0,String p1,boolean p2,MerchantTrilateralUrlWhiteListModel p3);
    void rj(Activity p0,String p1,LiveStreamFeed p2);
    KwaiDialogFragment xJ(FragmentActivity p0,String p1,Map p2,f p3,c p4);
}
