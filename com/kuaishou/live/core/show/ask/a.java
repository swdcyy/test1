package com.kuaishou.live.core.show.ask.a;
import java.lang.Object;
import java.util.HashSet;
import i32.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import hf3.a;
import com.kuaishou.livestream.message.nano.SCLiveAskOpened;
import i32.d;
import lf3.g;
import com.kuaishou.livestream.message.nano.SCLiveAskClosed;
import i32.e;
import com.kuaishou.livestream.message.nano.SCLiveAskLocked;
import i32.f;
import com.kuaishou.livestream.message.nano.SCLiveAskUnLocked;
import i32.g;
import com.kuaishou.livestream.message.nano.SCLiveAskAnsweringQuestion;
import i32.a;
import com.kuaishou.livestream.message.nano.SCLiveAskAnsweringQuestionEnd;
import i32.b;
import com.kuaishou.livestream.message.nano.SCLiveAskQuestionStatusChange;
import i32.c;

public class a	// class@0009c5
{
    public a a;
    public Set b;
    public String c;
    public boolean d;
    public boolean e;

    public void a(){
       super();
       this.b = new HashSet();
       this.d = false;
       this.e = false;
    }
    public void a(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       this.b.add(p0);
       return;
    }
    public String b(){
       return this.c;
    }
    public void c(a p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "1")) {
          return;
       }
       this.a = p0;
       if (!PatchProxy.applyVoid(null, this, uoa, "2")) {
          this.a.u0(703, SCLiveAskOpened.class, new d(this));
          this.a.u0(704, SCLiveAskClosed.class, new e(this));
          this.a.u0(705, SCLiveAskLocked.class, new f(this));
          this.a.u0(706, SCLiveAskUnLocked.class, new g(this));
          this.a.u0(695, SCLiveAskAnsweringQuestion.class, new a(this));
          this.a.u0(696, SCLiveAskAnsweringQuestionEnd.class, new b(this));
          this.a.u0(697, SCLiveAskQuestionStatusChange.class, new c(this));
       }
       return;
    }
    public boolean d(){
       return this.d;
    }
    public boolean e(){
       return this.e;
    }
    public void f(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       this.b.remove(p0);
       return;
    }
    public void g(String p0){
       this.c = p0;
    }
}
