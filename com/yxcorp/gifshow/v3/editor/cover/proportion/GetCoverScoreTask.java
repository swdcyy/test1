package com.yxcorp.gifshow.v3.editor.cover.proportion.GetCoverScoreTask;
import com.kwai.video.editorsdk2.RenderPosDetail;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import java.lang.StringBuilder;
import android.graphics.Bitmap;
import tpc.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.kve.SmartCoverTaskBuilder;
import msd.a;
import android.os.SystemClock;
import com.yxcorp.gifshow.v3.editor.cover.proportion.GetCoverScoreTask$startTime$1;

public final class GetCoverScoreTask	// class@000e8d
{
    public boolean a;
    public final String b;
    public final int c;
    public Bitmap d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public double i;
    public FaceData[] j;
    public SmartCoverTaskBuilder k;
    public final String l;
    public final double m;
    public final float n;
    public final boolean o;

    public void GetCoverScoreTask(double p0,float p1,RenderPosDetail p2,boolean p3,EditorSdk2V2$VideoEditorProject p4,int p5,u p6){
       String str;
       if (p5 & 0x08) {
          p3 = false;
       }
       a.p(p2, "positionDetail");
       a.p(p4, "project");
       super();
       this.m = p0;
       this.n = p1;
       this.o = p3;
       this.a = true;
       if (p4.trackAssetsSize() >= p2.getTrackAssetIndex() && p4.trackAssetsSize() > 0) {
          EditorSdk2V2$TrackAsset trackAsset = p4.trackAssets(p2.getTrackAssetIndex());
          if (trackAsset != null) {
             str = trackAsset.assetPath();
             if (str != null) {
             label_003e :
                this.b = str;
                int i = (int)(p2.getTrackAssetOriginalPtsSec() * (double)1000.00f);
                this.c = i;
                this.i = Double.MIN_VALUE;
                if (!p3) {
                   str = str+i;
                }
                this.l = str;
                return;
             }
          }
       }
       str = "";
       goto label_003e ;
    }
    public final Bitmap a(){
       return this.d;
    }
    public final long b(){
       return this.e;
    }
    public final String c(){
       return this.l;
    }
    public final String d(){
       return this.b;
    }
    public final a e(){
       Object obj = PatchProxy.apply(null, this, GetCoverScoreTask.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a uoa = new a(this.m, this.n, this.b, this.i, this.o, this.l);
       return obj;
    }
    public final double f(){
       return this.i;
    }
    public final double g(){
       return this.m;
    }
    public final boolean h(){
       return this.a;
    }
    public final boolean i(){
       boolean b = (this.i - 1)? true: false;
       return b;
    }
    public final void j(SmartCoverTaskBuilder p0){
       this.k = p0;
    }
    public final void k(boolean p0){
       this.a = p0;
    }
    public final a l(){
       Object obj = PatchProxy.apply(null, this, GetCoverScoreTask.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new GetCoverScoreTask$startTime$1(SystemClock.elapsedRealtime());
    }
    public String toString(){
       StringBuilder obj = PatchProxy.apply(null, this, GetCoverScoreTask.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "path:"+this.b+" \t time:"+this.m+" \t progress:"+this.n+"\t result:"+this.i+" \t hasBitmap:";
       boolean b = true;
       boolean b1 = (this.d != null)? true: false;
       obj = obj+b1+' '+"\t "+"hasFaceData";
       if (this.j == null) {
          b = false;
       }
       return obj+b+" \t"+"fetchFrameBitmapCoast:"+this.e+" \t "+"fetchFaceDataCoast:"+this.f+" \t "+"recommendCoverScoreCoast:"+this.g;
    }
}
