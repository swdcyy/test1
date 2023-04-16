package com.kuaishou.android.vader.a;
import tq.c;
import java.lang.String;
import tq.d;
import java.lang.Object;
import com.google.gson.Gson;
import dr.c;
import yq.a;
import com.kuaishou.android.vader.config.LogControlConfig;
import java.lang.Class;
import java.lang.Exception;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.android.vader.config.ControlAction;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.android.vader.config.ControlRule;
import java.lang.Boolean;
import com.kuaishou.android.vader.config.MatchingCondition;
import com.kuaishou.android.vader.type.b;
import com.kuaishou.android.vader.type.Operator;
import dr.h;

public class a implements c	// class@000706
{
    public final c a;
    public final d b;
    public final ControlAction c;
    public final LogControlConfig d;
    public final Gson e;

    public void a(String p0,d p1){
       LogControlConfig logControlCo;
       super();
       Gson gson = new Gson();
       this.e = gson;
       this.a = new c();
       this.b = p1;
       a uoa = new a();
       try{
          this.c = uoa;
          logControlCo = gson.h(p0, LogControlConfig.class);
       }catch(com.google.gson.JsonParseException e3){
          this.b.a(e3);
          logControlCo = null;
       }
       if (logControlCo == null) {
          logControlCo = new LogControlConfig();
       }
       this.d = logControlCo;
       return;
    }
    public ControlAction a(MessageNano p0){
       ControlRule uControlRule;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d.getRules().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return this.c;
          }
          uControlRule = obj.next();
          try{
             if (this.b(uControlRule, p0)) {
                break ;
             }
          }catch(java.lang.Exception e4){
             this.b.a(e4);
             return this.c;
          }
       }
       return uControlRule.getAction();
    }
    public final boolean b(ControlRule p0,MessageNano p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       Iterator iterator = p0.getConditions().iterator();
       while (iterator.hasNext()) {
          MatchingCondition matchingCond = iterator.next();
          b uob = this.a.a(p1);
          Iterator iterator1 = matchingCond.getPath().iterator();
          while (iterator1.hasNext()) {
             uob = uob.a(iterator1.next());
          }
          if (!uob.b(matchingCond.getOperator(), matchingCond.getValue())) {
             b = false;
          }
       }
       return b;
    }
}
