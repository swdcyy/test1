package com.yxcorp.gifshow.detail.plc.helper.i$a;
import yka.c;
import com.yxcorp.gifshow.detail.plc.helper.i;
import java.lang.Object;
import yka.b;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import f4a.l;
import com.yxcorp.gifshow.detail.plc.helper.ApkDownloadHelper$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Exception;

public class i$a implements c	// class@00167b
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return b.b(this);
    }
    public boolean b(){
       return b.a(this);
    }
    public void c(GameCenterDownloadParams$DownloadInfo p0){
       i g;
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       GameCenterDownloadParams$DownloadInfo mStage = p0.mStage;
       Objects.requireNonNull(mStage);
       int i = -1;
       switch (mStage.hashCode()){
           case 0xae7a2e7a:
             if (mStage.equals("cancel")) {
                i = 0;
             }
             break;
           case 0xc454c22d:
             if (mStage.equals("progress")) {
                i = 1;
             }
             break;
           case 0xc84dc82d:
             if (mStage.equals("resume")) {
                i = 2;
             }
             break;
           case 0xdc453139:
             if (mStage.equals("complete")) {
                i = 3;
             }
             break;
           case 0x379175:
             if (mStage.equals("wait")) {
                i = 4;
             }
             break;
           case 0x5c4d208:
             if (mStage.equals("error")) {
                i = 5;
             }
             break;
           case 0x65825f6:
             if (mStage.equals("pause")) {
                i = 6;
             }
             break;
           case 0x68ac462:
             if (mStage.equals("start")) {
                i = 7;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             this.a.d.g();
             break;
           case 1:
             this.a.d.h(p0.mSoFarBytes, p0.mTotalBytes, p0.mPercent);
             this.a.d.c(p0.mSoFarBytes, p0.mTotalBytes, p0.mPercent);
             break;
           case 2:
             this.a.d.h(p0.mSoFarBytes, p0.mTotalBytes, p0.mPercent);
             break;
           case 3:
             this.a.d.b();
             g = this.a.g;
             if (g != null) {
                g.A(p0.mSoFarBytes, p0.mTotalBytes);
             }
             break;
           case 4:
             this.a.d.d();
             break;
           case 5:
             this.a.d.e(p0.mSoFarBytes, p0.mTotalBytes, p0.mPercent);
             String str = (TextUtils.x(p0.mMsg))? "download error": p0.mMsg;
             this.a.d.f(new Exception(str));
             break;
           case 6:
             g = this.a.g;
             if (g != null) {
                g.s(p0.mSoFarBytes, p0.mTotalBytes);
             }
             this.a.d.e(p0.mSoFarBytes, p0.mTotalBytes, p0.mPercent);
             break;
           case 7:
             if (!p0.mSoFarBytes) {
                i g1 = this.a.g;
                if (g1 != null) {
                   g1.f();
                }
             }
             break;
           default:
       }
    label_011c :
       return;
    }
}
