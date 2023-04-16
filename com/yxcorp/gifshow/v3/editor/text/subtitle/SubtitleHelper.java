package com.yxcorp.gifshow.v3.editor.text.subtitle.SubtitleHelper;
import com.yxcorp.gifshow.widget.adv.g;
import mrd.c;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.widget.adv.model.f;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import dvc.g;
import java.lang.Object;
import crd.a;
import io.reactivex.subjects.PublishSubject;
import android.view.View;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.kuaishou.edit.draft.FeatureId$b;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.InternalFeatureId;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.v3.editor.text.subtitle.k;
import voc.o;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.util.Iterator;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import com.yxcorp.gifshow.edit.previewer.utils.AudioAssetUtils$AssetIdType;
import com.yxcorp.gifshow.edit.previewer.utils.AudioAssetUtils;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$RangeHandler;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import java.lang.Double;
import faa.a;
import q87.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import com.yxcorp.gifshow.v3.editor.text.subtitle.p;
import java.util.Comparator;
import java.util.Collections;
import com.yxcorp.gifshow.widget.adv.model.a;
import java.lang.StringBuilder;
import crd.b;
import huc.n1;
import dvc.x;
import kuaishou.perf.page.impl.d;
import com.yxcorp.gifshow.widget.adv.Action;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import evc.b$a;
import com.yxcorp.gifshow.widget.adv.c;
import evc.c;

public class SubtitleHelper implements g	// class@001489
{
    public final a a;
    public c b;
    public k c;
    public b d;
    public FeatureId e;
    public c f;
    public EditorSdk2V2$VideoEditorProject g;
    public VideoSDKPlayerView h;
    public EditorDelegate i;
    public f j;
    public c k;
    public g l;
    public long m;
    public EditorSdk2V2$AudioAsset n;

    public void SubtitleHelper(c p0,EditorDelegate p1,f p2,EditorSdk2V2$VideoEditorProject p3,c p4,g p5){
       super();
       this.a = new a();
       this.b = PublishSubject.g();
       this.n = null;
       this.j = p2;
       this.i = p1;
       this.h = p1.z();
       this.g = p3;
       FeatureId$b uob = FeatureId.newBuilder();
       uob.b(InternalFeatureId.TEXT_SHADOW_01);
       this.e = uob.build();
       this.c = new k(p4, p3, this.i.x().e());
       this.f = p0;
       this.k = p4;
       this.l = p5;
    }
    public static boolean f(EditorSdk2V2$VideoEditorProject p0,boolean p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(SubtitleHelper.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), null, SubtitleHelper.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = true;
       if (p0 == null) {
          return b;
       }else if(p0.audioAssets().isNotEmpty()){
          Iterator iterator = p0.audioAssets().iterator();
          double d = Double.MIN_VALUE;
          while (iterator.hasNext()) {
             EditorSdk2V2$AudioAsset uAudioAsset = iterator.next();
             int i = uAudioAsset.assetAudioFlag() & b;
             if (i != b && (uAudioAsset.assetId() - (long)AudioAssetUtils.a(AudioAssetUtils$AssetIdType.RECORD_AUDIO_ASSET) && (p2 || p3))) {
                if (p3 || (p2 && AudioAssetUtils.g(uAudioAsset.assetId()))) {
                   continue ;
                }else if(uAudioAsset.volume()){
                   d = 0;
                }
             }
             if (p1 && (!uAudioAsset.assetId() - (long)AudioAssetUtils.a(AudioAssetUtils$AssetIdType.MUSIC_AUDIO_ASSET) && uAudioAsset.volume())) {
                d = 0;
             }
          }
          b = d;
       }
       if (p0.trackAssets().isNotEmpty()) {
          Iterator iterator1 = p0.trackAssets().iterator();
          while (iterator1.hasNext()) {
             EditorSdk2V2$TrackAsset trackAsset = iterator1.next();
             if (trackAsset.volume() || (p2 && !TextUtils.isEmpty(trackAsset.assetAudioPath()))) {
                b = false;
             }
          }
       }
       return b;
    }
    public boolean a(ITimelineView$IRangeView$RangeHandler p0,ITimelineView$IRangeView$a p1,double p2){
       ArrayList obj;
       if (PatchProxy.isSupport(SubtitleHelper.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Double.valueOf(p2), this, SubtitleHelper.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().s("SubtitleHelper", "onHandlerSeekRequire", objArray);
       obj = new ArrayList(this.e());
       Collections.sort(obj, p.b);
       double int i1 = obj.indexOf(p1);
       double d = 0;
       if (p0 == ITimelineView$IRangeView$RangeHandler.LEFT) {
          if (i1 > 0) {
             a uoa = obj.get((i1 - 1));
             i1 = uoa.h() + uoa.j();
             double d1 = (p1.h() + p2) - d;
             Object[] objArray1 = new Object[i];
             a.D().s("SubtitleHelper", "onHandlerSeekRequire, left: previewRangeEnd: "+i1+", fixedRangeStart: "+d1, objArray1);
             if (d1 - i1 > 0) {
                i = true;
             }
             return i;
          }
       }else if(i1 < (obj.size() - 1)){
          i1 = ((p1.h() + p1.j()) + p2) + d;
          d = obj.get((i1 + 1)).h();
          Object[] objArray2 = new Object[i];
          a.D().s("SubtitleHelper", "onHandlerSeekRequire, right: nextRangeStart: "+d+", fixedRangeEnd: "+i1, objArray2);
          if (i1 - d < 0) {
             i = true;
          }
          return i;
       }
       return 1;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, SubtitleHelper.class, "1")) {
          return;
       }
       SubtitleHelper td = this.d;
       if (td != null && !td.isDisposed()) {
          this.d.dispose();
          this.a.a(this.d);
          n1.b(9, this.m);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, SubtitleHelper.class, "8")) {
          return;
       }
       this.a.dispose();
       return;
    }
    public FeatureId d(){
       return this.e;
    }
    public final List e(){
       return this.j.f;
    }
    public final void g(boolean p0){
       SubtitleHelper subtitleHelp = SubtitleHelper.class;
       if (PatchProxy.isSupport(subtitleHelp) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, subtitleHelp, "3")) {
          return;
       }
       d uod = d.d(x.a);
       String str = (p0)? "1": "0";
       uod.a("success", str);
       d.d(x.a).h(x.d);
       d.d(x.a).c();
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, SubtitleHelper.class, "9")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.e().iterator();
       while (iterator.hasNext()) {
          Action uAction = iterator.next().d();
          String uploadText = (uAction.k() != null)? uAction.k().getUploadText(): "";
          b$a uoa = new b$a();
          uoa.f(uploadText);
          uoa.e((float)uAction.c());
          uoa.d((float)uAction.a());
          uArrayList.add(uoa);
       }
       this.i.g(new c(uArrayList, this.c.a, this.e.getInternalValue()));
       return;
    }
    public void i(FeatureId p0){
       this.e = p0;
    }
}
