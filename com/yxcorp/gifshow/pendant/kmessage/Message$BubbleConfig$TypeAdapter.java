package com.yxcorp.gifshow.pendant.kmessage.Message$BubbleConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.pendant.kmessage.Message$BubbleConfig;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class Message$BubbleConfig$TypeAdapter extends TypeAdapter	// class@001267
{
    public final Gson a;
    public static final a b;

    static {
       Message$BubbleConfig$TypeAdapter.b = a.get(Message$BubbleConfig.class);
    }
    public void Message$BubbleConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, Message$BubbleConfig$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          int i = 0;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new Message$BubbleConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x36452d:
                      if (str.equals("text")) {
                         i = 0;
                      }
                      break;
                    case 0xa8de315:
                      if (str.equals("linkUrl")) {
                         i = 1;
                      }
                      break;
                    case 0x4207e876:
                      if (str.equals("displayDuration")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mText = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mLinkUrl = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mDisplayDuration = KnownTypeAdapters$k.a(p0, obj.mDisplayDuration);
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Message$BubbleConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mText != null) {
             p0.r("text");
             TypeAdapters.A.write(p0, p1.mText);
          }
          if (p1.mLinkUrl != null) {
             p0.r("linkUrl");
             TypeAdapters.A.write(p0, p1.mLinkUrl);
          }
          p0.r("displayDuration");
          p0.K((long)p1.mDisplayDuration);
          p0.j();
       }
       return;
    }
}