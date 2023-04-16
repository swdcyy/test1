package com.kwai.framework.model.user.RichTextMeta$Param$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.model.user.RichTextMeta$Param;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.framework.model.user.QUserContactName$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.internal.bind.TypeAdapters;
import com.kwai.framework.model.user.QUserContactName;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class RichTextMeta$Param$TypeAdapter extends TypeAdapter	// class@001725
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       RichTextMeta$Param$TypeAdapter.c = a.get(RichTextMeta$Param.class);
    }
    public void RichTextMeta$Param$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(QUserContactName$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, RichTextMeta$Param$TypeAdapter.class, "2");
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
             obj = new RichTextMeta$Param();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xa92b7a8d:
                      if (str.equals("enableAlias")) {
                         i = 0;
                      }
                      break;
                    case 0xb6a62da2:
                      if (str.equals("truncationThreshold")) {
                         i = 1;
                      }
                      break;
                    case 0xc09b2e36:
                      if (str.equals("textColor")) {
                         i = 2;
                      }
                      break;
                    case 0xc1a09044:
                      if (str.equals("textValue")) {
                         i = 3;
                      }
                      break;
                    case 0xc42dea07:
                      if (str.equals("textType")) {
                         i = 4;
                      }
                      break;
                    case 0xce2b2e46:
                      if (str.equals("userId")) {
                         i = 5;
                      }
                      break;
                    case 0xcf62458a:
                      if (str.equals("keyName")) {
                         i = 6;
                      }
                      break;
                    case 0x26d02cb:
                      if (str.equals("contactName")) {
                         i = 7;
                      }
                      break;
                    case 0xa8de315:
                      if (str.equals("linkUrl")) {
                         i = 8;
                      }
                      break;
                    case 0x15c83b7a:
                      if (str.equals("fontName")) {
                         i = 9;
                      }
                      break;
                    case 0x15caa0f0:
                      if (str.equals("fontSize")) {
                         i = 10;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mEnableAlias = KnownTypeAdapters$g.a(p0, obj.mEnableAlias);
                      break;
                    case 1:
                      obj.mTruncationThreshold = KnownTypeAdapters$k.a(p0, obj.mTruncationThreshold);
                      break;
                    case 2:
                      obj.mTextColor = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mTextValue = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mTextType = KnownTypeAdapters$k.a(p0, obj.mTextType);
                      break;
                    case 5:
                      obj.mUserId = KnownTypeAdapters$n.a(p0, obj.mUserId);
                      break;
                    case 6:
                      obj.mKeyName = TypeAdapters.A.read(p0);
                      break;
                    case 7:
                      obj.mContactName = this.b.read(p0);
                      break;
                    case 8:
                      obj.mLinkUrl = TypeAdapters.A.read(p0);
                      break;
                    case 9:
                      obj.mFontName = TypeAdapters.A.read(p0);
                      break;
                    case 10:
                      obj.mFontSize = KnownTypeAdapters$k.a(p0, obj.mFontSize);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RichTextMeta$Param$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("textType");
          p0.K((long)p1.mTextType);
          if (p1.mTextValue != null) {
             p0.r("textValue");
             TypeAdapters.A.write(p0, p1.mTextValue);
          }
          if (p1.mKeyName != null) {
             p0.r("keyName");
             TypeAdapters.A.write(p0, p1.mKeyName);
          }
          p0.r("userId");
          p0.K(p1.mUserId);
          p0.r("enableAlias");
          p0.P(p1.mEnableAlias);
          if (p1.mContactName != null) {
             p0.r("contactName");
             this.b.write(p0, p1.mContactName);
          }
          if (p1.mLinkUrl != null) {
             p0.r("linkUrl");
             TypeAdapters.A.write(p0, p1.mLinkUrl);
          }
          p0.r("truncationThreshold");
          p0.K((long)p1.mTruncationThreshold);
          if (p1.mFontName != null) {
             p0.r("fontName");
             TypeAdapters.A.write(p0, p1.mFontName);
          }
          p0.r("fontSize");
          p0.K((long)p1.mFontSize);
          if (p1.mTextColor != null) {
             p0.r("textColor");
             TypeAdapters.A.write(p0, p1.mTextColor);
          }
          p0.j();
       }
       return;
    }
}
