package com.yxcorp.gifshow.camera.record.assistant.a;
import com.yxcorp.gifshow.camera.record.assistant.a$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.intelligentidentify.b;
import sd9.c;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper;
import com.yxcorp.gifshow.widget.q;
import dc9.c;
import com.yxcorp.gifshow.camera.record.assistant.utils.AssistantUtils;
import com.yxcorp.gifshow.camera.record.intelligentidentify.a;
import com.yxcorp.gifshow.camera.record.assistant.a$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import cc9.f;
import android.content.Intent;
import bc9.k;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import android.view.View;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import kotlin.jvm.internal.a;
import ec9.j;
import java.util.List;
import com.kwai.gifshow.post.api.core.model.PosterActivityTabInfo;
import ec9.f1;

public final class a	// class@001cf6
{
    public int A;
    public String B;
    public boolean a;
    public final b b;
    public final AssistantDataHelper c;
    public f1 d;
    public final q e;
    public boolean f;
    public AssistantResponse g;
    public List h;
    public final c i;
    public k j;
    public boolean k;
    public f l;
    public int m;
    public boolean n;
    public PosterActivityTabInfo o;
    public boolean p;
    public ViewStubInflater2 q;
    public View r;
    public View s;
    public View t;
    public Intent u;
    public j v;
    public final a w;
    public final a$b x;
    public final a$b y;
    public List z;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final a$a I;

    static {
       a.I = new a$a(null);
       a.D = 1;
       a.E = 2;
       a.F = 3;
       a.G = 4;
       a.H = 5;
    }
    public void a(){
       super();
       b uob = new b(new c());
       this.b = uob;
       this.c = new AssistantDataHelper(uob);
       this.e = new q();
       this.i = new c();
       this.n = AssistantUtils.d.j() ^ 1;
       this.p = true;
       this.w = new a();
       this.x = new a$b();
       this.y = new a$b();
       this.A = a.C;
       this.B = "";
    }
    public final boolean A(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.B() || this.E())? true: false;
       return b;
    }
    public final boolean B(){
       boolean b = (this.A == a.F)? true: false;
       return b;
    }
    public final boolean C(){
       boolean b = (this.A == a.C)? true: false;
       return b;
    }
    public final boolean D(){
       return this.f;
    }
    public final boolean E(){
       boolean b = (this.A == a.H)? true: false;
       return b;
    }
    public final boolean F(){
       boolean b = (this.f == null && this.p != null)? true: false;
       return b;
    }
    public final boolean G(){
       boolean b = (this.A == a.G)? true: false;
       return b;
    }
    public final void H(boolean p0){
       this.k = p0;
    }
    public final void I(f p0){
       this.l = p0;
    }
    public final void J(int p0){
       this.A = p0;
    }
    public final void K(Intent p0){
       this.u = p0;
    }
    public final void L(boolean p0){
       this.f = p0;
       if (p0) {
          this.p = false;
       }
       return;
    }
    public final void M(k p0){
       this.j = p0;
    }
    public final void N(AssistantResponse p0){
       this.g = p0;
    }
    public final void O(boolean p0){
       this.a = p0;
    }
    public final void P(boolean p0){
       this.n = p0;
    }
    public final int a(){
       return this.m;
    }
    public final String b(){
       return this.B;
    }
    public final View c(){
       return this.s;
    }
    public final AssistantDataHelper d(){
       return this.c;
    }
    public final ViewStubInflater2 e(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("assistantPanelViewStubInflater");
       }
       return obj;
    }
    public final a$b f(){
       return this.x;
    }
    public final j g(){
       a obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v;
       if (obj == null) {
          a.S("assistantViewModel");
       }
       return obj;
    }
    public final c h(){
       return this.i;
    }
    public final View i(){
       return this.t;
    }
    public final f j(){
       return this.l;
    }
    public final List k(){
       return this.h;
    }
    public final q l(){
       return this.e;
    }
    public final int m(){
       return this.A;
    }
    public final Intent n(){
       return this.u;
    }
    public final PosterActivityTabInfo o(){
       return this.o;
    }
    public final k p(){
       return this.j;
    }
    public final a$b q(){
       return this.y;
    }
    public final f1 r(){
       a obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          a.S("recommendViewModel");
       }
       return obj;
    }
    public final View s(){
       return this.r;
    }
    public final AssistantResponse t(){
       return this.g;
    }
    public final boolean u(){
       return this.a;
    }
    public final a v(){
       return this.w;
    }
    public final boolean w(){
       return this.n;
    }
    public final boolean x(){
       boolean b = (this.A == a.E)? true: false;
       return b;
    }
    public final boolean y(){
       boolean b = (this.A == a.D)? true: false;
       return b;
    }
    public final boolean z(){
       return this.k;
    }
}
