package er2.d$a;
import lf3.g;
import er2.d;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCLiveVoicePartyPkOpMicSeats;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vp2.a;
import tp2.d;
import java.lang.CharSequence;
import android.text.TextUtils;
import qk.m;
import er2.c;
import ok.o;
import er2.b;
import ok.h;
import com.google.common.collect.ImmutableList;
import java.util.Objects;
import er2.g;
import java.util.ArrayList;
import java.lang.Iterable;
import er2.e;
import java.util.Collection;
import java.util.List;
import er2.f;
import lf3.f;

public class d$a implements g	// class@0027ba
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
       }else if(!TextUtils.equals(this.b.k.U().d(), p0.pkId)){
          d l = this.b.l;
          ImmutableList immutableLis = m.t(p0.micSeatDetailInfo).p(c.b).F(b.b).B();
          Objects.requireNonNull(l);
          if (!PatchProxy.applyVoidOneRefs(immutableLis, l, g.class, "5")) {
             if (l.e != null) {
                ArrayList uArrayList = new ArrayList();
                m.s(immutableLis).p(new e(l)).n(uArrayList);
                l.a(uArrayList, true);
                uArrayList = new ArrayList();
                m.s(l.d).p(new f(immutableLis)).n(uArrayList);
                l.a(uArrayList, false);
             }
             l.d.clear();
             l.d.addAll(immutableLis);
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
