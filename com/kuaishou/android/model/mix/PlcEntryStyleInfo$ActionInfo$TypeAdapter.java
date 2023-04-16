package com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$DownloadInfo$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$e;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.Map;
import com.google.gson.stream.b;

public final class PlcEntryStyleInfo$ActionInfo$TypeAdapter extends TypeAdapter	// class@000d71
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       PlcEntryStyleInfo$ActionInfo$TypeAdapter.e = a.get(PlcEntryStyleInfo$ActionInfo.class);
    }
    public void PlcEntryStyleInfo$ActionInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(PlcEntryStyleInfo$DownloadInfo$TypeAdapter.b);
       this.b = typeAdapter;
       TypeAdapter a = TypeAdapters.A;
       this.c = new KnownTypeAdapters$MapTypeAdapter(a, typeAdapter, new KnownTypeAdapters$e());
       this.d = new KnownTypeAdapters$MapTypeAdapter(a, a, new KnownTypeAdapters$e());
    }
    public PlcEntryStyleInfo$ActionInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PlcEntryStyleInfo$ActionInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PlcEntryStyleInfo$ActionInfo uActionInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uActionInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uActionInfo;
       }else {
          p0.c();
          PlcEntryStyleInfo$ActionInfo uActionInfo1 = new PlcEntryStyleInfo$ActionInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x9ab693b1:
                   if (str.equals("actionEndIconUrl")) {
                      i = 0;
                   }
                   break;
                 case 0xb46c6320:
                   if (str.equals("actionIconUrl")) {
                      i = 1;
                   }
                   break;
                 case 0xad8ddd:
                   if (str.equals("downloadInfos")) {
                      i = 2;
                   }
                   break;
                 case 0xb43dfe5:
                   if (str.equals("bizRequiredParameterMap")) {
                      i = 3;
                   }
                   break;
                 case 0xbd19b59:
                   if (str.equals("actionUrl")) {
                      i = 4;
                   }
                   break;
                 case 0x335f55ca:
                   if (str.equals("actionDarkIconUrl")) {
                      i = 5;
                   }
                   break;
                 case 0x59ea50e5:
                   if (str.equals("actionSubUrl")) {
                      i = 6;
                   }
                   break;
                 case 0x5d51825e:
                   if (str.equals("actionLabel")) {
                      i = 7;
                   }
                   break;
                 case 0x6e617690:
                   if (str.equals("actionType")) {
                      i = 8;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uActionInfo1.mActionEndIconUrl = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uActionInfo1.mActionIconUrl = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   uActionInfo1.mDownloadInfoMap = this.c.read(p0);
                   break;
                 case 3:
                   uActionInfo1.mRequiredParams = this.d.read(p0);
                   break;
                 case 4:
                   uActionInfo1.mActionUrl = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   uActionInfo1.mActionDarkIconUrl = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   uActionInfo1.mActionSubUrl = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   uActionInfo1.mActionLabel = TypeAdapters.A.read(p0);
                   break;
                 case 8:
                   uActionInfo1.mActionType = KnownTypeAdapters$k.a(p0, uActionInfo1.mActionType);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uActionInfo1;
       }
    }
    public void b(b p0,PlcEntryStyleInfo$ActionInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlcEntryStyleInfo$ActionInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("actionType");
          p0.K((long)p1.mActionType);
          if (p1.mActionLabel != null) {
             p0.r("actionLabel");
             TypeAdapters.A.write(p0, p1.mActionLabel);
          }
          if (p1.mActionIconUrl != null) {
             p0.r("actionIconUrl");
             TypeAdapters.A.write(p0, p1.mActionIconUrl);
          }
          if (p1.mActionDarkIconUrl != null) {
             p0.r("actionDarkIconUrl");
             TypeAdapters.A.write(p0, p1.mActionDarkIconUrl);
          }
          if (p1.mActionEndIconUrl != null) {
             p0.r("actionEndIconUrl");
             TypeAdapters.A.write(p0, p1.mActionEndIconUrl);
          }
          if (p1.mActionUrl != null) {
             p0.r("actionUrl");
             TypeAdapters.A.write(p0, p1.mActionUrl);
          }
          if (p1.mDownloadInfoMap != null) {
             p0.r("downloadInfos");
             this.c.write(p0, p1.mDownloadInfoMap);
          }
          if (p1.mActionSubUrl != null) {
             p0.r("actionSubUrl");
             TypeAdapters.A.write(p0, p1.mActionSubUrl);
          }
          if (p1.mRequiredParams != null) {
             p0.r("bizRequiredParameterMap");
             this.d.write(p0, p1.mRequiredParams);
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
