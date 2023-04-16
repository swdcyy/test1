package haa.a;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import fba.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.RuntimeException;
import raa.a;
import maa.a;
import haa.f;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.List;
import q87.c;
import saa.a;
import qaa.a;
import naa.a;
import xaa.a;
import saa.c;
import saa.e;
import raa.c;
import raa.e;
import vaa.a;
import yaa.c;
import gba.a;
import bba.b;
import eba.a;
import hba.a;
import raa.g;
import jba.a;
import raa.i;
import lba.a;
import kba.a;

public final class a	// class@0025ee
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final a a(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       a uoa = p0.n0();
       if (uoa != null) {
          return uoa;
       }
       throw new RuntimeException("getCoverDraft undo draft can not be null");
    }
    public static final a b(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       a uoa = p0.m0();
       if (uoa != null) {
          return uoa;
       }
       throw new RuntimeException("getAeEffectDraft AEEffectDraft draft can not be null");
    }
    public static final a c(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       a uoa = p0.o0();
       if (uoa != null) {
          return uoa;
       }
       throw new RuntimeException("getAssetDraft asset draft can not be null");
    }
    public static final a d(String p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "tag");
       a.p(p1, "workspaceDraft");
       a uoa = a.c(p1);
       Object[] objArray = new Object[0];
       f.D().w(p0, "getAssetDraftPrintState isEditing:"+uoa.D()+','+"committedMessages:"+uoa.o().size()+", "+"messages:"+uoa.z().size(), objArray);
       return uoa;
    }
    public static final a e(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       a uoa = p0.r0();
       if (uoa != null) {
          return uoa;
       }
       throw new RuntimeException("getColorFilterDraft color filter draft can not be null");
    }
    public static final a f(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       a uoa = p0.s0();
       if (uoa != null) {
          return uoa;
       }
       throw new RuntimeException("getCoverDraft undo draft can not be null");
    }
    public static final a g(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       a uoa = p0.u0();
       if (uoa != null) {
          return uoa;
       }
       throw new RuntimeException("getEditBeautyDraft edit beauty draft can not be null");
    }
    public static final a h(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       a uoa = p0.w0();
       if (uoa != null) {
          return uoa;
       }
       throw new RuntimeException("getEditBeautyDraft edit makeup draft can not be null");
    }
    public static final c i(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       p0 = p0.x0();
       if (p0 != null) {
          return p0;
       }
       throw new RuntimeException("getEnhanceColorFilterDraft enhance color filter draft can not be null");
    }
    public static final e j(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       e uoe = p0.y0();
       if (uoe != null) {
          return uoe;
       }
       throw new RuntimeException("getEnhanceColorFilterResultDraft draft can not be null");
    }
    public static final c k(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       p0 = p0.z0();
       if (p0 != null) {
          return p0;
       }
       throw new RuntimeException("getFaceMagicEffectDraft FaceMagicEffectDraft draft can not be null");
    }
    public static final e l(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       e uoe = p0.C0();
       if (uoe != null) {
          return uoe;
       }
       throw new RuntimeException("getHighlightTimeEffectDraft HighlightTimeEffectDraft draft can not be null");
    }
    public static final a m(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       a uoa = p0.F0();
       if (uoa != null) {
          return uoa;
       }
       throw new RuntimeException("getUndoDraft kuaishan draft can not be null");
    }
    public static final c n(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       p0 = p0.J0();
       if (p0 != null) {
          return p0;
       }
       throw new RuntimeException("getUndoDraft music draft can not be null");
    }
    public static final a o(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       a uoa = p0.O0();
       if (uoa != null) {
          return uoa;
       }
       throw new RuntimeException("getTtsDraft tts draft can not be null");
    }
    public static final b p(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       b uob = p0.Q0();
       if (uob != null) {
          return uob;
       }
       throw new RuntimeException("getPublishDraft , can not be null");
    }
    public static final a q(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       a uoa = p0.U0();
       if (uoa != null) {
          return uoa;
       }
       throw new RuntimeException("getStickerDraft sticker draft can not be null");
    }
    public static final a r(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       a uoa = p0.W0();
       if (uoa != null) {
          return uoa;
       }
       throw new RuntimeException("getTextDraft text draft can not be null");
    }
    public static final g s(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       g og = p0.Y0();
       if (og != null) {
          return og;
       }
       throw new RuntimeException("getTimeEffectDraft TimeEffectDraft draft can not be null");
    }
    public static final a t(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       a uoa = p0.Z0();
       if (uoa != null) {
          return uoa;
       }
       throw new RuntimeException("getTtsDraft tts draft can not be null");
    }
    public static final i v(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       i oi = p0.f1();
       if (oi != null) {
          return oi;
       }
       throw new RuntimeException("getVisualEffectDraft VisualEffectDraft draft can not be null");
    }
    public static final a w(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       a uoa = p0.g1();
       if (uoa != null) {
          return uoa;
       }
       throw new RuntimeException("getUndoDraft music draft can not be null");
    }
    public final a u(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       a uoa = p0.c1();
       if (uoa != null) {
          return uoa;
       }
       throw new RuntimeException("getUndoDraft undo draft can not be null");
    }
}
