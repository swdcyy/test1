package com.kuaishou.live.core.show.subscribe.edit.s;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.subscribe.edit.LiveSubscribeEditFragment;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Number;
import android.widget.TextView;
import java.util.List;
import java.util.Collections;
import java.lang.Iterable;
import qk.m;
import com.kuaishou.live.core.show.subscribe.edit.r;
import ok.o;
import sk2.c0;
import java.util.Map;
import ok.h;
import com.google.common.collect.ImmutableList;
import java.util.Date;
import uk2.d;
import java.util.Calendar;
import com.contrarywind.view.WheelView;
import vk2.b;
import java.text.SimpleDateFormat;
import java.lang.Integer;
import com.kuaishou.live.core.show.subscribe.edit.LiveSubscribeEditFragment$b;
import ok.x;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import wk2.s;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.google.gson.JsonArray;
import java.util.Iterator;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Long;
import com.kuaishou.live.core.show.subscribe.edit.LiveSubscribeEditFragment$a;

public class s extends m	// class@001126
{
    public final LiveSubscribeEditFragment c;

    public void s(LiveSubscribeEditFragment p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       int i;
       List list1;
       boolean b;
       JsonObject jsonObject;
       JsonArray jsonArray;
       Iterator iterator;
       ClientContent$ContentPackage uContentPack;
       LiveSubscribeEditFragment s;
       long l;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, obj, s.class, str)) {
          return;
       }
       s c = obj.c;
       Objects.requireNonNull(c);
       Object[] objArray = null;
       s obj1 = PatchProxy.apply(objArray, c, LiveSubscribeEditFragment.class, "27");
       ClientEvent$ElementPackage uElementPack = 2;
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else if(c.m.isSelected()){
          i = 1;
       }else {
          i = 2;
       }
       obj1 = obj.c;
       Objects.requireNonNull(obj1);
       String str1 = "26";
       List list = PatchProxy.apply(objArray, obj1, LiveSubscribeEditFragment.class, str1);
       if (list != patchProxyRe) {
       }else if(obj1.m.isSelected()){
          list = Collections.emptyList();
       }else if(obj1.n.isSelected()){
          list = LiveSubscribeEditFragment.x;
       }else {
          s = obj1.q;
          Objects.requireNonNull(s);
          list = m.s(obj1.p).p(r.b).F(new c0(s)).B();
       }
       obj1 = obj.c;
       Objects.requireNonNull(obj1);
       Date uDate = PatchProxy.apply(objArray, obj1, LiveSubscribeEditFragment.class, "12");
       int i1 = 0;
       s os = 5;
       if (uDate != patchProxyRe) {
       }else {
          s = obj1.s;
          Objects.requireNonNull(s);
          Calendar obj2 = PatchProxy.apply(objArray, s, d.class, "20");
          if (obj2 != patchProxyRe) {
             l = obj2.longValue();
          }else {
             obj2 = Calendar.getInstance();
             obj2.set(1, s.o);
             obj2.set(uElementPack, s.a(s.b));
             obj2.set(os, (s.a(s.c) + 1));
             obj2.set(11, s.a(s.d));
             obj2.set(12, s.a(s.e));
             obj2.set(13, i1);
             l = obj2.getTimeInMillis();
          }
          uDate = new Date(l);
       }
       obj1 = obj.c;
       Objects.requireNonNull(obj1);
       b uob = b.class;
       if (!PatchProxy.applyVoidTwoRefs(list, uDate, obj1, LiveSubscribeEditFragment.class, "9")) {
          String str2 = PatchProxy.applyOneRefs(uDate, objArray, uob, "2");
          if (str2 != patchProxyRe) {
          }else {
             str2 = b.b.format(uDate);
          }
          if (obj1.m.isSelected()) {
             list1 = Collections.singletonList(Integer.valueOf(i1));
             str = PatchProxy.applyOneRefs(uDate, objArray, uob, str);
             if (str != patchProxyRe) {
             }else {
                str = b.a.format(uDate);
             }
          }else if(obj1.n.isSelected()){
             list1 = Collections.singletonList(Integer.valueOf(100));
          }else {
             list1 = list;
          }
          Object[] objArray2 = objArray;
          b = obj1.eh();
          ClientContent$LiveStreamPackage liveStreamPa = obj1.j.e.get();
          ClientContent$LiveVoicePartyPackageV2 liveVoicePar = obj1.j.f.get();
          LiveSubscribeEditFragment$b a = obj1.j.a;
          if (PatchProxy.isSupport(s.class)) {
             Object[] objArray1 = new Object[]{Boolean.valueOf(b),list1,str,str2,liveStreamPa,liveVoicePar,Integer.valueOf(a)};
             if (!PatchProxy.applyVoid(objArray1, null, s.class, str1)) {
             }
          }else {
          }
       }
    label_01f7 :
       s c1 = obj.c;
       c1.k.d(i, list, c1.dh(), Long.valueOf(uDate.getTime()));
       return;
    }
}
