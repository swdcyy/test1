package com.kuaishou.android.model.mix.PlcEntryStyleInfo$DownloadInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$DownloadInfo;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class PlcEntryStyleInfo$DownloadInfo$TypeAdapter extends TypeAdapter	// class@000d85
{
    public final Gson a;
    public static final a b;

    static {
       PlcEntryStyleInfo$DownloadInfo$TypeAdapter.b = a.get(PlcEntryStyleInfo$DownloadInfo.class);
    }
    public void PlcEntryStyleInfo$DownloadInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PlcEntryStyleInfo$DownloadInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PlcEntryStyleInfo$DownloadInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PlcEntryStyleInfo$DownloadInfo uDownloadInf = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uDownloadInf;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uDownloadInf;
       }else {
          p0.c();
          PlcEntryStyleInfo$DownloadInfo uDownloadInf1 = new PlcEntryStyleInfo$DownloadInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x10d65d3:
                   if (str.equals("downloadPhase")) {
                      i = 0;
                   }
                   break;
                 case 0x1467eb0:
                   if (str.equals("downloadTitle")) {
                      i = 1;
                   }
                   break;
                 case 0x4215f521:
                   if (str.equals("downloadIcon")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uDownloadInf1.mDownloadPhase = KnownTypeAdapters$k.a(p0, uDownloadInf1.mDownloadPhase);
                   break;
                 case 1:
                   uDownloadInf1.mDownloadTitle = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   uDownloadInf1.mDownloadIcon = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uDownloadInf1;
       }
    }
    public void b(b p0,PlcEntryStyleInfo$DownloadInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlcEntryStyleInfo$DownloadInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("downloadPhase");
          p0.K((long)p1.mDownloadPhase);
          if (p1.mDownloadTitle != null) {
             p0.r("downloadTitle");
             TypeAdapters.A.write(p0, p1.mDownloadTitle);
          }
          if (p1.mDownloadIcon != null) {
             p0.r("downloadIcon");
             TypeAdapters.A.write(p0, p1.mDownloadIcon);
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
