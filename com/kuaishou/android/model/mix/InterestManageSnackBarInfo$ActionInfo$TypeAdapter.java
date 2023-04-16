package com.kuaishou.android.model.mix.InterestManageSnackBarInfo$ActionInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.InterestManageSnackBarInfo$ActionInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class InterestManageSnackBarInfo$ActionInfo$TypeAdapter extends TypeAdapter	// class@000cf1
{
    public final Gson a;
    public static final a b;

    static {
       InterestManageSnackBarInfo$ActionInfo$TypeAdapter.b = a.get(InterestManageSnackBarInfo$ActionInfo.class);
    }
    public void InterestManageSnackBarInfo$ActionInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public InterestManageSnackBarInfo$ActionInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, InterestManageSnackBarInfo$ActionInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       InterestManageSnackBarInfo$ActionInfo uActionInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uActionInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uActionInfo;
       }else {
          p0.c();
          InterestManageSnackBarInfo$ActionInfo uActionInfo1 = new InterestManageSnackBarInfo$ActionInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("description")) {
                if (!str.equals("scheme")) {
                   p0.Q();
                }else {
                   uActionInfo1.mScheme = TypeAdapters.A.read(p0);
                }
             }else {
                uActionInfo1.mDescription = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return uActionInfo1;
       }
    }
    public void b(b p0,InterestManageSnackBarInfo$ActionInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, InterestManageSnackBarInfo$ActionInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mDescription != null) {
             p0.r("description");
             TypeAdapters.A.write(p0, p1.mDescription);
          }
          if (p1.mScheme != null) {
             p0.r("scheme");
             TypeAdapters.A.write(p0, p1.mScheme);
          }
          p0.j();
          return;
       }
    }
    public Object read(a p0){
       return this.a(p0);
    }
    public void write(b p0,Object p1){
       this.b(p0, p1);
    }
}
