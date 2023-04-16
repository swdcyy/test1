package com.kwai.video.player.mid.manifest.v2.KwaiManifestTypeAdapter;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import com.google.gson.stream.JsonToken;
import java.lang.Object;
import com.kwai.video.player.mid.manifest.v2.KwaiManifestTypeAdapter$WhenMappings;
import java.lang.Enum;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Double;
import java.lang.Float;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.player.mid.manifest.v2.PlayInfo;
import java.util.ArrayList;
import com.kwai.video.player.mid.manifest.v2.Adaptation;
import java.util.List;
import com.kwai.video.player.mid.manifest.v2.VideoFeature;
import com.kwai.video.player.mid.manifest.v2.Representation;
import com.kwai.video.player.mid.manifest.v2.KvqScore;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Exception;
import com.google.gson.stream.b;
import java.lang.Number;
import java.util.Iterator;
import java.io.IOException;

public final class KwaiManifestTypeAdapter extends TypeAdapter	// class@000b6a
{

    public void KwaiManifestTypeAdapter(){
       super();
    }
    private final Object safeReadData(a p0,JsonToken p1){
       Boolean uBoolean = null;
       if (p0.J() != p1) {
          p0.Q();
          return uBoolean;
       }else {
          int i = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[p1.ordinal()];
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   p0.Q();
                }else {
                   uBoolean = Boolean.valueOf(p0.s());
                   a.y(2, "T");
                }
             }else {
                a.y(4, "T");
                i = Object.class;
                if (a.g(i, Integer.TYPE) || a.g(i, Integer.class)) {
                   uBoolean = Integer.valueOf(p0.v());
                   a.y(2, "T");
                }else if(a.g(i, Long.TYPE) || a.g(i, Long.class)){
                   uBoolean = Long.valueOf(p0.x());
                   a.y(2, "T");
                }else if(a.g(i, Double.TYPE) || a.g(i, Double.class)){
                   uBoolean = Double.valueOf(p0.u());
                   a.y(2, "T");
                }else if(a.g(i, Float.TYPE) || a.g(i, Float.class)){
                   uBoolean = Float.valueOf((float)p0.u());
                   a.y(2, "T");
                }else {
                   p0.Q();
                }
             }
          }else {
             uBoolean = p0.E();
             a.y(2, "T");
          }
          return uBoolean;
       }
    }
    public KwaiManifest read(a p0){
       JsonToken bOOLEAN;
       int i;
       Integer integer;
       Long longx;
       Double uDouble;
       Float uFloat;
       Boolean uBoolean1;
       KwaiManifest obj = PatchProxy.applyOneRefs(p0, this, KwaiManifestTypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "reader");
       obj = new KwaiManifest();
       p0.c();
       while (p0.l()) {
          String str = p0.y();
          if (str != null) {
             boolean b = false;
             Boolean uBoolean = null;
             switch (str.hashCode()){
                 case 0x8c021c77:
                   if (str.equals("manualDefaultSelect")) {
                      bOOLEAN = JsonToken.BOOLEAN;
                      if (p0.J() != bOOLEAN) {
                         p0.Q();
                      }else {
                         i = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[bOOLEAN.ordinal()];
                         if (i != 1) {
                            if (i != 2) {
                               if (i != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean = Boolean.valueOf(p0.s());
                               }
                            }else if(a.g(Boolean.class, Integer.TYPE) || a.g(Boolean.class, Integer.class)){
                               integer = Integer.valueOf(p0.v());
                               if (integer instanceof Boolean) {
                                  uBoolean = integer;
                               }
                            }else if(a.g(Boolean.class, Long.TYPE) || a.g(Boolean.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof Boolean) {
                                  uBoolean = longx;
                               }
                            }else if(a.g(Boolean.class, Double.TYPE) || a.g(Boolean.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof Boolean) {
                                  uBoolean = uDouble;
                               }
                            }else if(a.g(Boolean.class, Float.TYPE) || a.g(Boolean.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof Boolean) {
                                  uBoolean = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }else {
                            str = p0.E();
                            if (str instanceof Boolean) {
                               uBoolean = str;
                            }
                         }
                      }
                      if (uBoolean != null) {
                         b = uBoolean.booleanValue();
                      }
                      obj.mAutoDefaultSelect = b;
                   }
                   break;
                 case 0x963bbe11:
                   if (str.equals("hideAuto")) {
                      bOOLEAN = JsonToken.BOOLEAN;
                      if (p0.J() != bOOLEAN) {
                         p0.Q();
                      }else {
                         i = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[bOOLEAN.ordinal()];
                         if (i != 1) {
                            if (i != 2) {
                               if (i != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean = Boolean.valueOf(p0.s());
                               }
                            }else if(a.g(Boolean.class, Integer.TYPE) || a.g(Boolean.class, Integer.class)){
                               integer = Integer.valueOf(p0.v());
                               if (integer instanceof Boolean) {
                                  uBoolean = integer;
                               }
                            }else if(a.g(Boolean.class, Long.TYPE) || a.g(Boolean.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof Boolean) {
                                  uBoolean = longx;
                               }
                            }else if(a.g(Boolean.class, Double.TYPE) || a.g(Boolean.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof Boolean) {
                                  uBoolean = uDouble;
                               }
                            }else if(a.g(Boolean.class, Float.TYPE) || a.g(Boolean.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof Boolean) {
                                  uBoolean = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }else {
                            str = p0.E();
                            if (str instanceof Boolean) {
                               uBoolean = str;
                            }
                         }
                      }
                      if (uBoolean != null) {
                         b = uBoolean.booleanValue();
                      }
                      obj.mHideAuto = b;
                   }
                   break;
                 case 0xbcdd0dfb:
                   if (str.equals("videoFeature")) {
                      obj.mVideoFeature = this.readVideoFeature(p0);
                   }
                   break;
                 case 0xd7e6e31a:
                   if (str.equals("businessType")) {
                      bOOLEAN = JsonToken.NUMBER;
                      if (p0.J() != bOOLEAN) {
                         p0.Q();
                      }else {
                         i = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[bOOLEAN.ordinal()];
                         if (i != 1) {
                            if (i != 2) {
                               if (i != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean1 = Boolean.valueOf(p0.s());
                                  if (uBoolean1 instanceof Integer) {
                                     uBoolean = uBoolean1;
                                  }
                               }
                            }else if(a.g(Integer.class, Integer.TYPE) || a.g(Integer.class, Integer.class)){
                               uBoolean = Integer.valueOf(p0.v());
                            }else if(a.g(Integer.class, Long.TYPE) || a.g(Integer.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof Integer) {
                                  uBoolean = longx;
                               }
                            }else if(a.g(Integer.class, Double.TYPE) || a.g(Integer.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof Integer) {
                                  uBoolean = uDouble;
                               }
                            }else if(a.g(Integer.class, Float.TYPE) || a.g(Integer.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof Integer) {
                                  uBoolean = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }else {
                            str = p0.E();
                            if (str instanceof Integer) {
                               uBoolean = str;
                            }
                         }
                      }
                      if (uBoolean != null) {
                         b = uBoolean.intValue();
                      }
                      obj.mBusinessType = b;
                   }
                   break;
                 case 0xe8f6be4f:
                   if (str.equals("adaptationSet")) {
                      p0.a();
                      obj.mAdaptationSet = new ArrayList();
                      while (p0.l()) {
                         obj.mAdaptationSet.add(this.readAdaption(p0));
                      }
                      p0.g();
                   }
                   break;
                 case 0x14f51cd8:
                   if (str.equals("version")) {
                      bOOLEAN = JsonToken.STRING;
                      if (p0.J() != bOOLEAN) {
                         p0.Q();
                      }else {
                         i = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[bOOLEAN.ordinal()];
                         if (i != 1) {
                            if (i != 2) {
                               if (i != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean1 = Boolean.valueOf(p0.s());
                                  if (uBoolean1 instanceof String) {
                                     uBoolean = uBoolean1;
                                  }
                               }
                            }else if(a.g(String.class, Integer.TYPE) || a.g(String.class, Integer.class)){
                               integer = Integer.valueOf(p0.v());
                               if (integer instanceof String) {
                                  uBoolean = integer;
                               }
                            }else if(a.g(String.class, Long.TYPE) || a.g(String.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof String) {
                                  uBoolean = longx;
                               }
                            }else if(a.g(String.class, Double.TYPE) || a.g(String.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof String) {
                                  uBoolean = uDouble;
                               }
                            }else if(a.g(String.class, Float.TYPE) || a.g(String.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof String) {
                                  uBoolean = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }else {
                            str = p0.E();
                            if (str instanceof String) {
                               uBoolean = str;
                            }
                         }
                      }
                      obj.mVersion = uBoolean;
                   }
                   break;
                 case 0x1afceaf6:
                   if (str.equals("videoId")) {
                      bOOLEAN = JsonToken.STRING;
                      if (p0.J() != bOOLEAN) {
                         p0.Q();
                      }else {
                         i = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[bOOLEAN.ordinal()];
                         if (i != 1) {
                            if (i != 2) {
                               if (i != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean1 = Boolean.valueOf(p0.s());
                                  if (uBoolean1 instanceof String) {
                                     uBoolean = uBoolean1;
                                  }
                               }
                            }else if(a.g(String.class, Integer.TYPE) || a.g(String.class, Integer.class)){
                               integer = Integer.valueOf(p0.v());
                               if (integer instanceof String) {
                                  uBoolean = integer;
                               }
                            }else if(a.g(String.class, Long.TYPE) || a.g(String.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof String) {
                                  uBoolean = longx;
                               }
                            }else if(a.g(String.class, Double.TYPE) || a.g(String.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof String) {
                                  uBoolean = uDouble;
                               }
                            }else if(a.g(String.class, Float.TYPE) || a.g(String.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof String) {
                                  uBoolean = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }else {
                            str = p0.E();
                            if (str instanceof String) {
                               uBoolean = str;
                            }
                         }
                      }
                      obj.mVideoId = uBoolean;
                   }
                   break;
                 case 0x28fadf52:
                   if (str.equals("stereoType")) {
                      bOOLEAN = JsonToken.NUMBER;
                      if (p0.J() != bOOLEAN) {
                         p0.Q();
                      }else {
                         i = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[bOOLEAN.ordinal()];
                         if (i != 1) {
                            if (i != 2) {
                               if (i != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean1 = Boolean.valueOf(p0.s());
                                  if (uBoolean1 instanceof Integer) {
                                     uBoolean = uBoolean1;
                                  }
                               }
                            }else if(a.g(Integer.class, Integer.TYPE) || a.g(Integer.class, Integer.class)){
                               uBoolean = Integer.valueOf(p0.v());
                            }else if(a.g(Integer.class, Long.TYPE) || a.g(Integer.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof Integer) {
                                  uBoolean = longx;
                               }
                            }else if(a.g(Integer.class, Double.TYPE) || a.g(Integer.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof Integer) {
                                  uBoolean = uDouble;
                               }
                            }else if(a.g(Integer.class, Float.TYPE) || a.g(Integer.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof Integer) {
                                  uBoolean = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }else {
                            str = p0.E();
                            if (str instanceof Integer) {
                               uBoolean = str;
                            }
                         }
                      }
                      if (uBoolean != null) {
                         b = uBoolean.intValue();
                      }
                      obj.mStereoType = b;
                   }
                   break;
                 case 0x6ff6aa02:
                   if (str.equals("playInfo")) {
                      obj.mPlayInfo = this.readPlayInfo(p0);
                   }
                   break;
                 case 0x7f94e13e:
                   if (str.equals("mediaType")) {
                      bOOLEAN = JsonToken.NUMBER;
                      if (p0.J() != bOOLEAN) {
                         p0.Q();
                      }else {
                         i = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[bOOLEAN.ordinal()];
                         if (i != 1) {
                            if (i != 2) {
                               if (i != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean1 = Boolean.valueOf(p0.s());
                                  if (uBoolean1 instanceof Integer) {
                                     uBoolean = uBoolean1;
                                  }
                               }
                            }else if(a.g(Integer.class, Integer.TYPE) || a.g(Integer.class, Integer.class)){
                               uBoolean = Integer.valueOf(p0.v());
                            }else if(a.g(Integer.class, Long.TYPE) || a.g(Integer.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof Integer) {
                                  uBoolean = longx;
                               }
                            }else if(a.g(Integer.class, Double.TYPE) || a.g(Integer.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof Integer) {
                                  uBoolean = uDouble;
                               }
                            }else if(a.g(Integer.class, Float.TYPE) || a.g(Integer.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof Integer) {
                                  uBoolean = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }else {
                            str = p0.E();
                            if (str instanceof Integer) {
                               uBoolean = str;
                            }
                         }
                      }
                      if (uBoolean != null) {
                         b = uBoolean.intValue();
                      }
                      obj.mMediaType = b;
                   }
                   break;
                 default:
             }
          }
       label_062d :
          p0.Q();
       }
       p0.j();
       return obj;
    }
    public Object read(a p0){
       return this.read(p0);
    }
    public final Adaptation readAdaption(a p0){
       JsonToken nUMBER;
       int i1;
       Boolean uBoolean;
       Long longx;
       Double uDouble;
       Float uFloat;
       Integer integer1;
       Adaptation obj = PatchProxy.applyOneRefs(p0, this, KwaiManifestTypeAdapter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Adaptation();
       p0.c();
       while (p0.l()) {
          String str = p0.y();
          if (str != null) {
             int i = str.hashCode();
             Integer integer = null;
             if (i != -1992012396) {
                if (i != -821892768) {
                   if (i != -671065907) {
                      if (i == 3355 && str.equals("id")) {
                         nUMBER = JsonToken.NUMBER;
                         if (p0.J() != nUMBER) {
                            p0.Q();
                         }else {
                            i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[nUMBER.ordinal()];
                            if (i1 != 1) {
                               if (i1 != 2) {
                                  if (i1 != 3) {
                                     p0.Q();
                                  }else {
                                     uBoolean = Boolean.valueOf(p0.s());
                                     if (uBoolean instanceof Integer) {
                                        integer = uBoolean;
                                     }
                                  }
                               }else if(a.g(Integer.class, Integer.TYPE) || a.g(Integer.class, Integer.class)){
                                  integer = Integer.valueOf(p0.v());
                               }else if(a.g(Integer.class, Long.TYPE) || a.g(Integer.class, Long.class)){
                                  longx = Long.valueOf(p0.x());
                                  if (longx instanceof Integer) {
                                     integer = longx;
                                  }
                               }else if(a.g(Integer.class, Double.TYPE) || a.g(Integer.class, Double.class)){
                                  uDouble = Double.valueOf(p0.u());
                                  if (uDouble instanceof Integer) {
                                     integer = uDouble;
                                  }
                               }else if(a.g(Integer.class, Float.TYPE) || a.g(Integer.class, Float.class)){
                                  uFloat = Float.valueOf((float)p0.u());
                                  if (uFloat instanceof Integer) {
                                     integer = uFloat;
                                  }
                               }else {
                                  p0.Q();
                               }
                            }else {
                               str = p0.E();
                               if (str instanceof Integer) {
                                  integer = str;
                               }
                            }
                         }
                         i1 = (integer != null)? integer.intValue(): 0;
                         obj.mId = i1;
                      }
                   }else if(str.equals("representation")){
                      obj.mRepresentation = new ArrayList();
                      p0.a();
                      while (p0.l()) {
                         obj.mRepresentation.add(this.readRepresentation(p0));
                      }
                      p0.g();
                   }
                }else if(str.equals("vcodec")){
                   nUMBER = JsonToken.STRING;
                   if (p0.J() != nUMBER) {
                      p0.Q();
                   }else {
                      i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[nUMBER.ordinal()];
                      if (i1 != 1) {
                         if (i1 != 2) {
                            if (i1 != 3) {
                               p0.Q();
                            }else {
                               uBoolean = Boolean.valueOf(p0.s());
                               if (uBoolean instanceof String) {
                                  integer = uBoolean;
                               }
                            }
                         }else {
                            str = String.class;
                            if (a.g(str, Integer.TYPE) || a.g(str, Integer.class)) {
                               integer1 = Integer.valueOf(p0.v());
                               if (integer1 instanceof String) {
                                  integer = integer1;
                               }
                            }else if(a.g(str, Long.TYPE) || a.g(str, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof String) {
                                  integer = longx;
                               }
                            }else if(a.g(str, Double.TYPE) || a.g(str, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof String) {
                                  integer = uDouble;
                               }
                            }else if(a.g(str, Float.TYPE) || a.g(str, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof String) {
                                  integer = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }
                      }else {
                         str = p0.E();
                         if (str instanceof String) {
                            integer = str;
                         }
                      }
                   }
                   if (integer == null) {
                      integer = "";
                   }
                   obj.vcodec = integer;
                }
             }else if(str.equals("duration")){
                nUMBER = JsonToken.NUMBER;
                if (p0.J() != nUMBER) {
                   p0.Q();
                }else {
                   i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[nUMBER.ordinal()];
                   if (i1 != 1) {
                      if (i1 != 2) {
                         if (i1 != 3) {
                            p0.Q();
                         }else {
                            uBoolean = Boolean.valueOf(p0.s());
                            if (uBoolean instanceof Float) {
                               integer = uBoolean;
                            }
                         }
                      }else if(a.g(Float.class, Integer.TYPE) || a.g(Float.class, Integer.class)){
                         integer1 = Integer.valueOf(p0.v());
                         if (integer1 instanceof Float) {
                            integer = integer1;
                         }
                      }else if(a.g(Float.class, Long.TYPE) || a.g(Float.class, Long.class)){
                         longx = Long.valueOf(p0.x());
                         if (longx instanceof Float) {
                            integer = longx;
                         }
                      }else if(a.g(Float.class, Double.TYPE) || a.g(Float.class, Double.class)){
                         uDouble = Double.valueOf(p0.u());
                         if (uDouble instanceof Float) {
                            integer = uDouble;
                         }
                      }else if(a.g(Float.class, Float.TYPE) || a.g(Float.class, Float.class)){
                         integer = Float.valueOf((float)p0.u());
                      }else {
                         p0.Q();
                      }
                   }else {
                      str = p0.E();
                      if (str instanceof Float) {
                         integer = str;
                      }
                   }
                }
                float f = (integer != null)? integer.floatValue(): 0;
                obj.mDurationMs = f;
             }
          }
          p0.Q();
       }
       p0.j();
       return obj;
    }
    public final KvqScore readKvqScore(a p0){
       JsonToken nUMBER;
       int i1;
       Boolean uBoolean;
       Integer integer;
       Long longx;
       Double uDouble;
       KvqScore obj = PatchProxy.applyOneRefs(p0, this, KwaiManifestTypeAdapter.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new KvqScore();
       p0.c();
       while (p0.l()) {
          String str = p0.y();
          if (str != null) {
             int i = str.hashCode();
             float f = 0;
             Float uFloat = null;
             if (i != 2252) {
                if (i == 2500 && str.equals("NR")) {
                   nUMBER = JsonToken.NUMBER;
                   if (p0.J() != nUMBER) {
                      p0.Q();
                   }else {
                      i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[nUMBER.ordinal()];
                      if (i1 != 1) {
                         if (i1 != 2) {
                            if (i1 != 3) {
                               p0.Q();
                            }else {
                               uBoolean = Boolean.valueOf(p0.s());
                               if (uBoolean instanceof Float) {
                                  uFloat = uBoolean;
                               }
                            }
                         }else if(a.g(Float.class, Integer.TYPE) || a.g(Float.class, Integer.class)){
                            integer = Integer.valueOf(p0.v());
                            if (integer instanceof Float) {
                               uFloat = integer;
                            }
                         }else if(a.g(Float.class, Long.TYPE) || a.g(Float.class, Long.class)){
                            longx = Long.valueOf(p0.x());
                            if (longx instanceof Float) {
                               uFloat = longx;
                            }
                         }else if(a.g(Float.class, Double.TYPE) || a.g(Float.class, Double.class)){
                            uDouble = Double.valueOf(p0.u());
                            if (uDouble instanceof Float) {
                               uFloat = uDouble;
                            }
                         }else if(a.g(Float.class, Float.TYPE) || a.g(Float.class, Float.class)){
                            uFloat = Float.valueOf((float)p0.u());
                         }else {
                            p0.Q();
                         }
                      }else {
                         str = p0.E();
                         if (str instanceof Float) {
                            uFloat = str;
                         }
                      }
                   }
                   if (uFloat != null) {
                      f = uFloat.floatValue();
                   }
                   obj.mNR = f;
                }
             }else if(str.equals("FR")){
                nUMBER = JsonToken.NUMBER;
                if (p0.J() != nUMBER) {
                   p0.Q();
                }else {
                   i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[nUMBER.ordinal()];
                   if (i1 != 1) {
                      if (i1 != 2) {
                         if (i1 != 3) {
                            p0.Q();
                         }else {
                            uBoolean = Boolean.valueOf(p0.s());
                            if (uBoolean instanceof Float) {
                               uFloat = uBoolean;
                            }
                         }
                      }else if(a.g(Float.class, Integer.TYPE) || a.g(Float.class, Integer.class)){
                         integer = Integer.valueOf(p0.v());
                         if (integer instanceof Float) {
                            uFloat = integer;
                         }
                      }else if(a.g(Float.class, Long.TYPE) || a.g(Float.class, Long.class)){
                         longx = Long.valueOf(p0.x());
                         if (longx instanceof Float) {
                            uFloat = longx;
                         }
                      }else if(a.g(Float.class, Double.TYPE) || a.g(Float.class, Double.class)){
                         uDouble = Double.valueOf(p0.u());
                         if (uDouble instanceof Float) {
                            uFloat = uDouble;
                         }
                      }else if(a.g(Float.class, Float.TYPE) || a.g(Float.class, Float.class)){
                         uFloat = Float.valueOf((float)p0.u());
                      }else {
                         p0.Q();
                      }
                   }else {
                      str = p0.E();
                      if (str instanceof Float) {
                         uFloat = str;
                      }
                   }
                }
                if (uFloat != null) {
                   f = uFloat.floatValue();
                }
                obj.mFR = f;
             }
          }
          p0.Q();
       }
       p0.j();
       return obj;
    }
    public final PlayInfo readPlayInfo(a p0){
       int i1;
       Integer integer1;
       PlayInfo obj = PatchProxy.applyOneRefs(p0, this, KwaiManifestTypeAdapter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PlayInfo();
       p0.c();
       obj.mDisableAudio = new ArrayList();
       while (p0.l()) {
          String str = p0.y();
          if (str != null) {
             int i = str.hashCode();
             Integer integer = null;
             if (i != -1013573170) {
                if (i == -370901887 && str.equals("cdnTimeRangeLevel")) {
                   JsonToken nUMBER = JsonToken.NUMBER;
                   if (p0.J() != nUMBER) {
                      p0.Q();
                   }else {
                      i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[nUMBER.ordinal()];
                      if (i1 != 1) {
                         if (i1 != 2) {
                            if (i1 != 3) {
                               p0.Q();
                            }else {
                               Boolean uBoolean = Boolean.valueOf(p0.s());
                               if (uBoolean instanceof Integer) {
                                  integer = uBoolean;
                               }
                            }
                         }else if(a.g(Integer.class, Integer.TYPE) || a.g(Integer.class, Integer.class)){
                            integer = Integer.valueOf(p0.v());
                         }else if(a.g(Integer.class, Long.TYPE) || a.g(Integer.class, Long.class)){
                            Long longx = Long.valueOf(p0.x());
                            if (longx instanceof Integer) {
                               integer = longx;
                            }
                         }else if(a.g(Integer.class, Double.TYPE) || a.g(Integer.class, Double.class)){
                            Double uDouble = Double.valueOf(p0.u());
                            if (uDouble instanceof Integer) {
                               integer = uDouble;
                            }
                         }else if(a.g(Integer.class, Float.TYPE) || a.g(Integer.class, Float.class)){
                            Float uFloat = Float.valueOf((float)p0.u());
                            if (uFloat instanceof Integer) {
                               integer = uFloat;
                            }
                         }else {
                            p0.Q();
                         }
                      }else {
                         str = p0.E();
                         if (str instanceof Integer) {
                            integer = str;
                         }
                      }
                   }
                   i1 = (integer != null)? integer.intValue(): 0;
                   obj.mCdnTimeRangeLevel = i1;
                }
             }else if(str.equals("disableAudio")){
                p0.a();
                while (p0.l()) {
                   PlayInfo mDisableAudi = obj.mDisableAudio;
                   JsonToken nUMBER1 = JsonToken.NUMBER;
                   if (p0.J() != nUMBER1) {
                      p0.Q();
                   label_0136 :
                      integer1 = integer;
                   }else {
                      i = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[nUMBER1.ordinal()];
                      if (i != 1) {
                         if (i != 2) {
                            if (i != 3) {
                               p0.Q();
                               goto label_0136 ;
                            }else {
                               integer1 = Boolean.valueOf(p0.s());
                               if (!integer1 instanceof Integer) {
                                  integer1 = integer;
                               }
                            }
                         }else if(a.g(Integer.class, Integer.TYPE) || a.g(Integer.class, Integer.class)){
                            integer1 = Integer.valueOf(p0.v());
                         }else if(a.g(Integer.class, Long.TYPE) || a.g(Integer.class, Long.class)){
                            integer1 = Long.valueOf(p0.x());
                            if (!integer1 instanceof Integer) {
                               integer1 = integer;
                            }
                         }else if(a.g(Integer.class, Double.TYPE) || a.g(Integer.class, Double.class)){
                            integer1 = Double.valueOf(p0.u());
                            if (!integer1 instanceof Integer) {
                               integer1 = integer;
                            }
                         }else if(a.g(Integer.class, Float.TYPE) || a.g(Integer.class, Float.class)){
                            integer1 = Float.valueOf((float)p0.u());
                            if (!integer1 instanceof Integer) {
                               integer1 = integer;
                            }
                         }else {
                            p0.Q();
                            goto label_0136 ;
                         }
                      }else {
                         integer1 = p0.E();
                         if (!integer1 instanceof Integer) {
                            integer1 = integer;
                         }
                      }
                   }
                   mDisableAudi.add(integer1);
                }
                p0.g();
             }
          }
          p0.Q();
       }
       p0.j();
       return obj;
    }
    public final Representation readRepresentation(a p0){
       JsonToken sTRING;
       int i1;
       Boolean uBoolean;
       Integer integer1;
       Long longx;
       Double uDouble;
       Float uFloat;
       Representation bitratePatte;
       Integer integer2;
       Boolean uBoolean1;
       Boolean uBoolean2;
       Integer integer3;
       Boolean uBoolean3;
       String obj = PatchProxy.applyOneRefs(p0, this, KwaiManifestTypeAdapter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Representation representati = new Representation();
       p0.c();
       while (p0.l()) {
          obj = p0.y();
          if (obj != null) {
             String str = "";
             String str1 = null;
             JsonToken jsonToken = 3;
             int i = 2;
             float f = Float.MIN_VALUE;
             Integer integer = null;
             switch (obj.hashCode()){
                 case 0x92d0fdcc:
                   if (obj.equals("kvqScore")) {
                      representati.mKvqScore = this.readKvqScore(p0);
                   }
                   break;
                 case 0x9e04a05b:
                   if (obj.equals("videoCodec")) {
                      sTRING = JsonToken.STRING;
                      if (p0.J() != sTRING) {
                         p0.Q();
                      }else {
                         i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[sTRING.ordinal()];
                         if (i1 != f) {
                            if (i1 != 0.00f) {
                               if (i1 != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean = Boolean.valueOf(p0.s());
                                  if (uBoolean instanceof String) {
                                     integer = uBoolean;
                                  }
                               }
                            }else if(a.g(String.class, Integer.TYPE) || a.g(String.class, Integer.class)){
                               integer1 = Integer.valueOf(p0.v());
                               if (integer1 instanceof String) {
                                  integer = integer1;
                               }
                            }else if(a.g(String.class, Long.TYPE) || a.g(String.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof String) {
                                  integer = longx;
                               }
                            }else if(a.g(String.class, Double.TYPE) || a.g(String.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof String) {
                                  integer = uDouble;
                               }
                            }else if(a.g(String.class, Float.TYPE) || a.g(String.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof String) {
                                  integer = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }else {
                            obj = p0.E();
                            if (obj instanceof String) {
                               integer = obj;
                            }
                         }
                      }
                      if (integer != null) {
                         str = integer;
                      }
                      representati.videoCodec = str;
                   }
                   break;
                 case 0xaf3af31d:
                   if (obj.equals("codecs")) {
                      sTRING = JsonToken.STRING;
                      if (p0.J() != sTRING) {
                         p0.Q();
                      }else {
                         i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[sTRING.ordinal()];
                         if (i1 != f) {
                            if (i1 != 0.00f) {
                               if (i1 != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean = Boolean.valueOf(p0.s());
                                  if (uBoolean instanceof String) {
                                     integer = uBoolean;
                                  }
                               }
                            }else if(a.g(String.class, Integer.TYPE) || a.g(String.class, Integer.class)){
                               integer1 = Integer.valueOf(p0.v());
                               if (integer1 instanceof String) {
                                  integer = integer1;
                               }
                            }else if(a.g(String.class, Long.TYPE) || a.g(String.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof String) {
                                  integer = longx;
                               }
                            }else if(a.g(String.class, Double.TYPE) || a.g(String.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof String) {
                                  integer = uDouble;
                               }
                            }else if(a.g(String.class, Float.TYPE) || a.g(String.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof String) {
                                  integer = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }else {
                            obj = p0.E();
                            if (obj instanceof String) {
                               integer = obj;
                            }
                         }
                      }
                      if (integer != null) {
                         str = integer;
                      }
                      representati.codecs = str;
                   }
                   break;
                 case 0xb7389127:
                   if (obj.equals("height")) {
                      sTRING = JsonToken.NUMBER;
                      if (p0.J() != sTRING) {
                         p0.Q();
                      }else {
                         i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[sTRING.ordinal()];
                         if (i1 != f) {
                            if (i1 != 0.00f) {
                               if (i1 != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean = Boolean.valueOf(p0.s());
                                  if (uBoolean instanceof Integer) {
                                     integer = uBoolean;
                                  }
                               }
                            }else if(a.g(Integer.class, Integer.TYPE) || a.g(Integer.class, Integer.class)){
                               integer = Integer.valueOf(p0.v());
                            }else if(a.g(Integer.class, Long.TYPE) || a.g(Integer.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof Integer) {
                                  integer = longx;
                               }
                            }else if(a.g(Integer.class, Double.TYPE) || a.g(Integer.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof Integer) {
                                  integer = uDouble;
                               }
                            }else if(a.g(Integer.class, Float.TYPE) || a.g(Integer.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof Integer) {
                                  integer = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }else {
                            obj = p0.E();
                            if (obj instanceof Integer) {
                               integer = obj;
                            }
                         }
                      }
                      if (integer != null) {
                         str1 = integer.intValue();
                      }
                      representati.mHeight = str1;
                   }
                   break;
                 case 0xb76e9daa:
                   if (obj.equals("hidden")) {
                      sTRING = JsonToken.BOOLEAN;
                      if (p0.J() != sTRING) {
                         p0.Q();
                      }else {
                         i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[sTRING.ordinal()];
                         if (i1 != f) {
                            if (i1 != 0.00f) {
                               if (i1 != 3) {
                                  p0.Q();
                               }else {
                                  integer = Boolean.valueOf(p0.s());
                               }
                            }else if(a.g(Boolean.class, Integer.TYPE) || a.g(Boolean.class, Integer.class)){
                               integer1 = Integer.valueOf(p0.v());
                               if (integer1 instanceof Boolean) {
                                  integer = integer1;
                               }
                            }else if(a.g(Boolean.class, Long.TYPE) || a.g(Boolean.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof Boolean) {
                                  integer = longx;
                               }
                            }else if(a.g(Boolean.class, Double.TYPE) || a.g(Boolean.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof Boolean) {
                                  integer = uDouble;
                               }
                            }else if(a.g(Boolean.class, Float.TYPE) || a.g(Boolean.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof Boolean) {
                                  integer = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }else {
                            obj = p0.E();
                            if (obj instanceof Boolean) {
                               integer = obj;
                            }
                         }
                      }
                      if (integer != null) {
                         str1 = integer.booleanValue();
                      }
                      representati.mHidden = str1;
                   }
                   break;
                 case 0xdea22cd9:
                   if (obj.equals("qualityType")) {
                      sTRING = JsonToken.STRING;
                      if (p0.J() != sTRING) {
                         p0.Q();
                      }else {
                         i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[sTRING.ordinal()];
                         if (i1 != f) {
                            if (i1 != 0.00f) {
                               if (i1 != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean = Boolean.valueOf(p0.s());
                                  if (uBoolean instanceof String) {
                                     integer = uBoolean;
                                  }
                               }
                            }else if(a.g(String.class, Integer.TYPE) || a.g(String.class, Integer.class)){
                               integer1 = Integer.valueOf(p0.v());
                               if (integer1 instanceof String) {
                                  integer = integer1;
                               }
                            }else if(a.g(String.class, Long.TYPE) || a.g(String.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof String) {
                                  integer = longx;
                               }
                            }else if(a.g(String.class, Double.TYPE) || a.g(String.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof String) {
                                  integer = uDouble;
                               }
                            }else if(a.g(String.class, Float.TYPE) || a.g(String.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof String) {
                                  integer = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }else {
                            obj = p0.E();
                            if (obj instanceof String) {
                               integer = obj;
                            }
                         }
                      }
                      if (integer != null) {
                         str = integer;
                      }
                      representati.mQualityType = str;
                   }
                   break;
                 case 0xe6292f7d:
                   if (obj.equals("cacheKey")) {
                      sTRING = JsonToken.STRING;
                      if (p0.J() != sTRING) {
                         p0.Q();
                      }else {
                         i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[sTRING.ordinal()];
                         if (i1 != f) {
                            if (i1 != 0.00f) {
                               if (i1 != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean = Boolean.valueOf(p0.s());
                                  if (uBoolean instanceof String) {
                                     integer = uBoolean;
                                  }
                               }
                            }else if(a.g(String.class, Integer.TYPE) || a.g(String.class, Integer.class)){
                               integer1 = Integer.valueOf(p0.v());
                               if (integer1 instanceof String) {
                                  integer = integer1;
                               }
                            }else if(a.g(String.class, Long.TYPE) || a.g(String.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof String) {
                                  integer = longx;
                               }
                            }else if(a.g(String.class, Double.TYPE) || a.g(String.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof String) {
                                  integer = uDouble;
                               }
                            }else if(a.g(String.class, Float.TYPE) || a.g(String.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof String) {
                                  integer = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }else {
                            obj = p0.E();
                            if (obj instanceof String) {
                               integer = obj;
                            }
                         }
                      }
                      if (integer != null) {
                         str = integer;
                      }
                      representati.cacheKey = str;
                   }
                   break;
                 case 0xe98537b5:
                   if (obj.equals("featureP2sp")) {
                      sTRING = JsonToken.BOOLEAN;
                      if (p0.J() != sTRING) {
                         p0.Q();
                      }else {
                         i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[sTRING.ordinal()];
                         if (i1 != f) {
                            if (i1 != 0.00f) {
                               if (i1 != 3) {
                                  p0.Q();
                               }else {
                                  integer = Boolean.valueOf(p0.s());
                               }
                            }else if(a.g(Boolean.class, Integer.TYPE) || a.g(Boolean.class, Integer.class)){
                               integer1 = Integer.valueOf(p0.v());
                               if (integer1 instanceof Boolean) {
                                  integer = integer1;
                               }
                            }else if(a.g(Boolean.class, Long.TYPE) || a.g(Boolean.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof Boolean) {
                                  integer = longx;
                               }
                            }else if(a.g(Boolean.class, Double.TYPE) || a.g(Boolean.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof Boolean) {
                                  integer = uDouble;
                               }
                            }else if(a.g(Boolean.class, Float.TYPE) || a.g(Boolean.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof Boolean) {
                                  integer = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }else {
                            obj = p0.E();
                            if (obj instanceof Boolean) {
                               integer = obj;
                            }
                         }
                      }
                      if (integer != null) {
                         str1 = integer.booleanValue();
                      }
                      representati.mFeatureP2sp = str1;
                   }
                   break;
                 case 0xf5279535:
                   if (obj.equals("qualityLabel")) {
                      sTRING = JsonToken.STRING;
                      if (p0.J() != sTRING) {
                         p0.Q();
                      }else {
                         i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[sTRING.ordinal()];
                         if (i1 != f) {
                            if (i1 != 0.00f) {
                               if (i1 != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean = Boolean.valueOf(p0.s());
                                  if (uBoolean instanceof String) {
                                     integer = uBoolean;
                                  }
                               }
                            }else if(a.g(String.class, Integer.TYPE) || a.g(String.class, Integer.class)){
                               integer1 = Integer.valueOf(p0.v());
                               if (integer1 instanceof String) {
                                  integer = integer1;
                               }
                            }else if(a.g(String.class, Long.TYPE) || a.g(String.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof String) {
                                  integer = longx;
                               }
                            }else if(a.g(String.class, Double.TYPE) || a.g(String.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof String) {
                                  integer = uDouble;
                               }
                            }else if(a.g(String.class, Float.TYPE) || a.g(String.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof String) {
                                  integer = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }else {
                            obj = p0.E();
                            if (obj instanceof String) {
                               integer = obj;
                            }
                         }
                      }
                      if (integer != null) {
                         str = integer;
                      }
                      representati.mQualityLabel = str;
                   }
                   break;
                 case 3355:
                   if (obj.equals("id")) {
                      sTRING = JsonToken.NUMBER;
                      if (p0.J() != sTRING) {
                         p0.Q();
                      }else {
                         i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[sTRING.ordinal()];
                         if (i1 != f) {
                            if (i1 != 0.00f) {
                               if (i1 != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean = Boolean.valueOf(p0.s());
                                  if (uBoolean instanceof Integer) {
                                     integer = uBoolean;
                                  }
                               }
                            }else if(a.g(Integer.class, Integer.TYPE) || a.g(Integer.class, Integer.class)){
                               integer = Integer.valueOf(p0.v());
                            }else if(a.g(Integer.class, Long.TYPE) || a.g(Integer.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof Integer) {
                                  integer = longx;
                               }
                            }else if(a.g(Integer.class, Double.TYPE) || a.g(Integer.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof Integer) {
                                  integer = uDouble;
                               }
                            }else if(a.g(Integer.class, Float.TYPE) || a.g(Integer.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof Integer) {
                                  integer = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }else {
                            obj = p0.E();
                            if (obj instanceof Integer) {
                               integer = obj;
                            }
                         }
                      }
                      if (integer != null) {
                         str1 = integer.intValue();
                      }
                      representati.mId = str1;
                   }
                   break;
                 case 0x1c56f:
                   if (obj.equals("url")) {
                      sTRING = JsonToken.STRING;
                      if (p0.J() != sTRING) {
                         p0.Q();
                      }else {
                         i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[sTRING.ordinal()];
                         if (i1 != f) {
                            if (i1 != 0.00f) {
                               if (i1 != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean = Boolean.valueOf(p0.s());
                                  if (uBoolean instanceof String) {
                                     integer = uBoolean;
                                  }
                               }
                            }else if(a.g(String.class, Integer.TYPE) || a.g(String.class, Integer.class)){
                               integer1 = Integer.valueOf(p0.v());
                               if (integer1 instanceof String) {
                                  integer = integer1;
                               }
                            }else if(a.g(String.class, Long.TYPE) || a.g(String.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof String) {
                                  integer = longx;
                               }
                            }else if(a.g(String.class, Double.TYPE) || a.g(String.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof String) {
                                  integer = uDouble;
                               }
                            }else if(a.g(String.class, Float.TYPE) || a.g(String.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof String) {
                                  integer = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }else {
                            obj = p0.E();
                            if (obj instanceof String) {
                               integer = obj;
                            }
                         }
                      }
                      if (integer != null) {
                         str = integer;
                      }
                      representati.mMailUrl = str;
                   }
                   break;
                 case 0x3b9c363:
                   if (obj.equals("bitratePattern")) {
                      representati.bitratePattern = new ArrayList();
                      p0.a();
                      while (p0.l()) {
                         bitratePatte = representati.bitratePattern;
                         JsonToken nUMBER = JsonToken.NUMBER;
                         if (p0.J() != nUMBER) {
                            p0.Q();
                         label_0c4e :
                            integer2 = integer;
                         }else {
                            int i2 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[nUMBER.ordinal()];
                            if (i2 != f) {
                               if (i2 != 2) {
                                  if (i2 != 3) {
                                     p0.Q();
                                     goto label_0c4e ;
                                  }else {
                                     integer2 = Boolean.valueOf(p0.s());
                                     if (!integer2 instanceof Integer) {
                                        integer2 = integer;
                                     }
                                  }
                               }else if(a.g(Integer.class, Integer.TYPE) || a.g(Integer.class, Integer.class)){
                                  integer2 = Integer.valueOf(p0.v());
                               }else if(a.g(Integer.class, Long.TYPE) || a.g(Integer.class, Long.class)){
                                  integer2 = Long.valueOf(p0.x());
                                  if (!integer2 instanceof Integer) {
                                     integer2 = integer;
                                  }
                               }else if(a.g(Integer.class, Double.TYPE) || a.g(Integer.class, Double.class)){
                                  integer2 = Double.valueOf(p0.u());
                                  if (!integer2 instanceof Integer) {
                                     integer2 = integer;
                                  }
                               }else if(a.g(Integer.class, Float.TYPE) || a.g(Integer.class, Float.class)){
                                  integer2 = Float.valueOf((float)p0.u());
                                  if (!integer2 instanceof Integer) {
                                     integer2 = integer;
                                  }
                               }else {
                                  p0.Q();
                                  goto label_0c4e ;
                               }
                            }else {
                               integer2 = p0.E();
                               if (!integer2 instanceof Integer) {
                                  integer2 = integer;
                               }
                            }
                         }
                         if (integer2 == null) {
                            integer2 = Integer.valueOf(str1);
                         }
                         bitratePatte.add(integer2);
                      }
                      p0.g();
                   }
                   break;
                 case 0x6be2dc6:
                   if (obj.equals("width")) {
                      sTRING = JsonToken.NUMBER;
                      if (p0.J() != sTRING) {
                         p0.Q();
                      }else {
                         i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[sTRING.ordinal()];
                         if (i1 != f) {
                            if (i1 != 0.00f) {
                               if (i1 != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean = Boolean.valueOf(p0.s());
                                  if (uBoolean instanceof Integer) {
                                     integer = uBoolean;
                                  }
                               }
                            }else if(a.g(Integer.class, Integer.TYPE) || a.g(Integer.class, Integer.class)){
                               integer = Integer.valueOf(p0.v());
                            }else if(a.g(Integer.class, Long.TYPE) || a.g(Integer.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof Integer) {
                                  integer = longx;
                               }
                            }else if(a.g(Integer.class, Double.TYPE) || a.g(Integer.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof Integer) {
                                  integer = uDouble;
                               }
                            }else if(a.g(Integer.class, Float.TYPE) || a.g(Integer.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof Integer) {
                                  integer = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }else {
                            obj = p0.E();
                            if (obj instanceof Integer) {
                               integer = obj;
                            }
                         }
                      }
                      if (integer != null) {
                         str1 = integer.intValue();
                      }
                      representati.mWidth = str1;
                   }
                   break;
                 case 0x1018283b:
                   if (obj.equals("avgBitrate")) {
                      sTRING = JsonToken.NUMBER;
                      if (p0.J() != sTRING) {
                         p0.Q();
                      }else {
                         i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[sTRING.ordinal()];
                         if (i1 != f) {
                            if (i1 != 0.00f) {
                               if (i1 != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean = Boolean.valueOf(p0.s());
                                  if (uBoolean instanceof Integer) {
                                     integer = uBoolean;
                                  }
                               }
                            }else if(a.g(Integer.class, Integer.TYPE) || a.g(Integer.class, Integer.class)){
                               integer = Integer.valueOf(p0.v());
                            }else if(a.g(Integer.class, Long.TYPE) || a.g(Integer.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof Integer) {
                                  integer = longx;
                               }
                            }else if(a.g(Integer.class, Double.TYPE) || a.g(Integer.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof Integer) {
                                  integer = uDouble;
                               }
                            }else if(a.g(Integer.class, Float.TYPE) || a.g(Integer.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof Integer) {
                                  integer = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }else {
                            obj = p0.E();
                            if (obj instanceof Integer) {
                               integer = obj;
                            }
                         }
                      }
                      if (integer != null) {
                         str1 = integer.intValue();
                      }
                      representati.avgBitrate = str1;
                   }
                   break;
                 case 0x1062f57e:
                   if (obj.equals("disableAdaptive")) {
                      sTRING = JsonToken.BOOLEAN;
                      if (p0.J() != sTRING) {
                         p0.Q();
                      }else {
                         i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[sTRING.ordinal()];
                         if (i1 != f) {
                            if (i1 != 0.00f) {
                               if (i1 != 3) {
                                  p0.Q();
                               }else {
                                  integer = Boolean.valueOf(p0.s());
                               }
                            }else if(a.g(Boolean.class, Integer.TYPE) || a.g(Boolean.class, Integer.class)){
                               integer1 = Integer.valueOf(p0.v());
                               if (integer1 instanceof Boolean) {
                                  integer = integer1;
                               }
                            }else if(a.g(Boolean.class, Long.TYPE) || a.g(Boolean.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof Boolean) {
                                  integer = longx;
                               }
                            }else if(a.g(Boolean.class, Double.TYPE) || a.g(Boolean.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof Boolean) {
                                  integer = uDouble;
                               }
                            }else if(a.g(Boolean.class, Float.TYPE) || a.g(Boolean.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof Boolean) {
                                  integer = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }else {
                            obj = p0.E();
                            if (obj instanceof Boolean) {
                               integer = obj;
                            }
                         }
                      }
                      if (integer != null) {
                         str1 = integer.booleanValue();
                      }
                      representati.mDisableAdaptive = str1;
                   }
                   break;
                 case 0x14f3aed0:
                   if (obj.equals("adaptiveType")) {
                      sTRING = JsonToken.NUMBER;
                      if (p0.J() != sTRING) {
                         p0.Q();
                      }else {
                         i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[sTRING.ordinal()];
                         if (i1 != f) {
                            if (i1 != 0.00f) {
                               if (i1 != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean = Boolean.valueOf(p0.s());
                                  if (uBoolean instanceof Integer) {
                                     integer = uBoolean;
                                  }
                               }
                            }else if(a.g(Integer.class, Integer.TYPE) || a.g(Integer.class, Integer.class)){
                               integer = Integer.valueOf(p0.v());
                            }else if(a.g(Integer.class, Long.TYPE) || a.g(Integer.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof Integer) {
                                  integer = longx;
                               }
                            }else if(a.g(Integer.class, Double.TYPE) || a.g(Integer.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof Integer) {
                                  integer = uDouble;
                               }
                            }else if(a.g(Integer.class, Float.TYPE) || a.g(Integer.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof Integer) {
                                  integer = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }else {
                            obj = p0.E();
                            if (obj instanceof Integer) {
                               integer = obj;
                            }
                         }
                      }
                      if (integer != null) {
                         str1 = integer.intValue();
                      }
                      representati.mAdaptiveType = str1;
                   }
                   break;
                 case 0x207cebed:
                   if (obj.equals("frameRate")) {
                      sTRING = JsonToken.NUMBER;
                      if (p0.J() != sTRING) {
                         p0.Q();
                      }else {
                         i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[sTRING.ordinal()];
                         if (i1 != f) {
                            if (i1 != 0.00f) {
                               if (i1 != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean = Boolean.valueOf(p0.s());
                                  if (uBoolean instanceof Float) {
                                     integer = uBoolean;
                                  }
                               }
                            }else if(a.g(Float.class, Integer.TYPE) || a.g(Float.class, Integer.class)){
                               integer1 = Integer.valueOf(p0.v());
                               if (integer1 instanceof Float) {
                                  integer = integer1;
                               }
                            }else if(a.g(Float.class, Long.TYPE) || a.g(Float.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof Float) {
                                  integer = longx;
                               }
                            }else if(a.g(Float.class, Double.TYPE) || a.g(Float.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof Float) {
                                  integer = uDouble;
                               }
                            }else if(a.g(Float.class, Float.TYPE) || a.g(Float.class, Float.class)){
                               integer = Float.valueOf((float)p0.u());
                            }else {
                               p0.Q();
                            }
                         }else {
                            obj = p0.E();
                            if (obj instanceof Float) {
                               integer = obj;
                            }
                         }
                      }
                      f = (integer != null)? integer.floatValue(): 0;
                      representati.mFrameRate = f;
                   }
                   break;
                 case 0x26d0c0ff:
                   if (obj.equals("quality")) {
                      sTRING = JsonToken.NUMBER;
                      if (p0.J() != sTRING) {
                         p0.Q();
                      }else {
                         i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[sTRING.ordinal()];
                         if (i1 != f) {
                            if (i1 != 0.00f) {
                               if (i1 != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean = Boolean.valueOf(p0.s());
                                  if (uBoolean instanceof Float) {
                                     integer = uBoolean;
                                  }
                               }
                            }else if(a.g(Float.class, Integer.TYPE) || a.g(Float.class, Integer.class)){
                               integer1 = Integer.valueOf(p0.v());
                               if (integer1 instanceof Float) {
                                  integer = integer1;
                               }
                            }else if(a.g(Float.class, Long.TYPE) || a.g(Float.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof Float) {
                                  integer = longx;
                               }
                            }else if(a.g(Float.class, Double.TYPE) || a.g(Float.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof Float) {
                                  integer = uDouble;
                               }
                            }else if(a.g(Float.class, Float.TYPE) || a.g(Float.class, Float.class)){
                               integer = Float.valueOf((float)p0.u());
                            }else {
                               p0.Q();
                            }
                         }else {
                            obj = p0.E();
                            if (obj instanceof Float) {
                               integer = obj;
                            }
                         }
                      }
                      f = (integer != null)? integer.floatValue(): 0;
                      representati.mQuality = f;
                   }
                   break;
                 case 0x2e9b2b50:
                   if (obj.equals("hdrType")) {
                      sTRING = JsonToken.NUMBER;
                      if (p0.J() != sTRING) {
                         p0.Q();
                      }else {
                         i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[sTRING.ordinal()];
                         if (i1 != f) {
                            if (i1 != 0.00f) {
                               if (i1 != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean = Boolean.valueOf(p0.s());
                                  if (uBoolean instanceof Integer) {
                                     integer = uBoolean;
                                  }
                               }
                            }else if(a.g(Integer.class, Integer.TYPE) || a.g(Integer.class, Integer.class)){
                               integer = Integer.valueOf(p0.v());
                            }else if(a.g(Integer.class, Long.TYPE) || a.g(Integer.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof Integer) {
                                  integer = longx;
                               }
                            }else if(a.g(Integer.class, Double.TYPE) || a.g(Integer.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof Integer) {
                                  integer = uDouble;
                               }
                            }else if(a.g(Integer.class, Float.TYPE) || a.g(Integer.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof Integer) {
                                  integer = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }else {
                            obj = p0.E();
                            if (obj instanceof Integer) {
                               integer = obj;
                            }
                         }
                      }
                      if (integer != null) {
                         str1 = integer.intValue();
                      }
                      representati.mDynamicType = str1;
                   }
                   break;
                 case 0x38a5ee5f:
                   if (obj.equals("comment")) {
                      sTRING = JsonToken.STRING;
                      if (p0.J() != sTRING) {
                         p0.Q();
                      }else {
                         i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[sTRING.ordinal()];
                         if (i1 != f) {
                            if (i1 != 0.00f) {
                               if (i1 != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean = Boolean.valueOf(p0.s());
                                  if (uBoolean instanceof String) {
                                     integer = uBoolean;
                                  }
                               }
                            }else if(a.g(String.class, Integer.TYPE) || a.g(String.class, Integer.class)){
                               integer1 = Integer.valueOf(p0.v());
                               if (integer1 instanceof String) {
                                  integer = integer1;
                               }
                            }else if(a.g(String.class, Long.TYPE) || a.g(String.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof String) {
                                  integer = longx;
                               }
                            }else if(a.g(String.class, Double.TYPE) || a.g(String.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof String) {
                                  integer = uDouble;
                               }
                            }else if(a.g(String.class, Float.TYPE) || a.g(String.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof String) {
                                  integer = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }else {
                            obj = p0.E();
                            if (obj instanceof String) {
                               integer = obj;
                            }
                         }
                      }
                      if (integer != null) {
                         integer2 = integer;
                      }
                      representati.mComment = integer2;
                   }
                   break;
                 case 0x3934829d:
                   if (obj.equals("defaultSelect")) {
                      sTRING = JsonToken.BOOLEAN;
                      if (p0.J() != sTRING) {
                         p0.Q();
                      }else {
                         i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[sTRING.ordinal()];
                         if (i1 != f) {
                            if (i1 != 0.00f) {
                               if (i1 != 3) {
                                  p0.Q();
                               }else {
                                  integer = Boolean.valueOf(p0.s());
                               }
                            }else if(a.g(Boolean.class, Integer.TYPE) || a.g(Boolean.class, Integer.class)){
                               integer1 = Integer.valueOf(p0.v());
                               if (integer1 instanceof Boolean) {
                                  integer = integer1;
                               }
                            }else if(a.g(Boolean.class, Long.TYPE) || a.g(Boolean.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof Boolean) {
                                  integer = longx;
                               }
                            }else if(a.g(Boolean.class, Double.TYPE) || a.g(Boolean.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof Boolean) {
                                  integer = uDouble;
                               }
                            }else if(a.g(Boolean.class, Float.TYPE) || a.g(Boolean.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof Boolean) {
                                  integer = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }else {
                            obj = p0.E();
                            if (obj instanceof Boolean) {
                               integer = obj;
                            }
                         }
                      }
                      if (integer != null) {
                         str1 = integer.booleanValue();
                      }
                      representati.mDefaultSelect = str1;
                   }
                   break;
                 case 0x3b3f5e03:
                   if (obj.equals("minorInfo")) {
                      sTRING = JsonToken.STRING;
                      if (p0.J() != sTRING) {
                         p0.Q();
                      }else {
                         i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[sTRING.ordinal()];
                         if (i1 != f) {
                            if (i1 != 0.00f) {
                               if (i1 != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean = Boolean.valueOf(p0.s());
                                  if (uBoolean instanceof String) {
                                     integer = uBoolean;
                                  }
                               }
                            }else if(a.g(String.class, Integer.TYPE) || a.g(String.class, Integer.class)){
                               integer1 = Integer.valueOf(p0.v());
                               if (integer1 instanceof String) {
                                  integer = integer1;
                               }
                            }else if(a.g(String.class, Long.TYPE) || a.g(String.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof String) {
                                  integer = longx;
                               }
                            }else if(a.g(String.class, Double.TYPE) || a.g(String.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof String) {
                                  integer = uDouble;
                               }
                            }else if(a.g(String.class, Float.TYPE) || a.g(String.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof String) {
                                  integer = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }else {
                            obj = p0.E();
                            if (obj instanceof String) {
                               integer = obj;
                            }
                         }
                      }
                      if (integer != null) {
                         integer2 = integer;
                      }
                      representati.mMinorInfo = integer2;
                   }
                   break;
                 case 0x3fe05569:
                   if (obj.equals("maxBitrate")) {
                      sTRING = JsonToken.NUMBER;
                      if (p0.J() != sTRING) {
                         p0.Q();
                      }else {
                         i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[sTRING.ordinal()];
                         if (i1 != f) {
                            if (i1 != 0.00f) {
                               if (i1 != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean = Boolean.valueOf(p0.s());
                                  if (uBoolean instanceof Integer) {
                                     integer = uBoolean;
                                  }
                               }
                            }else if(a.g(Integer.class, Integer.TYPE) || a.g(Integer.class, Integer.class)){
                               integer = Integer.valueOf(p0.v());
                            }else if(a.g(Integer.class, Long.TYPE) || a.g(Integer.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof Integer) {
                                  integer = longx;
                               }
                            }else if(a.g(Integer.class, Double.TYPE) || a.g(Integer.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof Integer) {
                                  integer = uDouble;
                               }
                            }else if(a.g(Integer.class, Float.TYPE) || a.g(Integer.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof Integer) {
                                  integer = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }else {
                            obj = p0.E();
                            if (obj instanceof Integer) {
                               integer = obj;
                            }
                         }
                      }
                      if (integer != null) {
                         str1 = integer.intValue();
                      }
                      representati.maxBitrate = str1;
                   }
                   break;
                 case 0x50c8e84d:
                   if (obj.equals("backupUrl")) {
                      ArrayList uArrayList = new ArrayList();
                      try{
                         representati.mBackupUrls = uArrayList;
                         p0.a();
                         while (p0.l()) {
                            bitratePatte = representati.mBackupUrls;
                            JsonToken sTRING1 = JsonToken.STRING;
                            if (p0.J() != sTRING1) {
                               p0.Q();
                            }else {
                               int i3 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[sTRING1.ordinal()];
                               if (i3 != f) {
                                  if (i3 != i) {
                                     if (i3 != jsonToken) {
                                        p0.Q();
                                     }else {
                                        uBoolean3 = Boolean.valueOf(p0.s());
                                        if (!uBoolean3 instanceof String) {
                                           uBoolean3 = integer;
                                        }
                                     }
                                  }else if(a.g(String.class, Integer.TYPE) || a.g(String.class, Integer.class)){
                                     uBoolean3 = Integer.valueOf(p0.v());
                                     if (!uBoolean3 instanceof String) {
                                        uBoolean3 = integer;
                                     }
                                  }else if(a.g(String.class, Long.TYPE) || a.g(String.class, Long.class)){
                                     uBoolean3 = Long.valueOf(p0.x());
                                     if (!uBoolean3 instanceof String) {
                                        uBoolean3 = integer;
                                     }
                                  }else if(a.g(String.class, Double.TYPE) || a.g(String.class, Double.class)){
                                     uBoolean3 = Double.valueOf(p0.u());
                                     if (!uBoolean3 instanceof String) {
                                        uBoolean3 = integer;
                                     }
                                  }else if(a.g(String.class, Float.TYPE) || a.g(String.class, Float.class)){
                                     integer3 = Float.valueOf((float)p0.u());
                                     if (!integer3 instanceof String) {
                                        integer3 = integer;
                                     }
                                  label_01fc :
                                     if (integer3 == null) {
                                        integer3 = str;
                                     }
                                     bitratePatte.add(integer3);
                                     jsonToken = 3;
                                     i = 2;
                                  }else {
                                     p0.Q();
                                  }
                                  integer3 = uBoolean3;
                                  goto label_01fc ;
                               }else {
                                  integer3 = p0.E();
                                  if (integer3 instanceof String) {
                                  }
                               }
                            }
                            integer3 = integer;
                            goto label_01fc ;
                         }
                         p0.g();
                      }catch(java.lang.Exception e0){
                         Exception uException = e0;
                         try{
                            sTRING = JsonToken.STRING;
                            if (p0.J() != sTRING) {
                               p0.Q();
                            }else {
                               i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[sTRING.ordinal()];
                               if (i1 != f) {
                                  if (i1 != 0.00f) {
                                     if (i1 != 3) {
                                        p0.Q();
                                     }else {
                                        uBoolean = Boolean.valueOf(p0.s());
                                        if (uBoolean instanceof String) {
                                           uBoolean2 = uBoolean;
                                        }
                                     }
                                  }else if(a.g(String.class, Integer.TYPE) || a.g(String.class, Integer.class)){
                                     integer1 = Integer.valueOf(p0.v());
                                     if (integer1 instanceof String) {
                                        uBoolean2 = integer1;
                                     }
                                  }else if(a.g(String.class, Long.TYPE) || a.g(String.class, Long.class)){
                                     longx = Long.valueOf(p0.x());
                                     if (longx instanceof String) {
                                        uBoolean2 = longx;
                                     }
                                  }else if(a.g(String.class, Double.TYPE) || a.g(String.class, Double.class)){
                                     uDouble = Double.valueOf(p0.u());
                                     if (uDouble instanceof String) {
                                        uBoolean2 = uDouble;
                                     }
                                  }else if(a.g(String.class, Float.TYPE) || a.g(String.class, Float.class)){
                                     uFloat = Float.valueOf((float)p0.u());
                                     if (uFloat instanceof String) {
                                        uBoolean2 = uFloat;
                                     }
                                  }else {
                                     p0.Q();
                                  }
                               }else {
                                  obj = p0.E();
                                  if (obj instanceof String) {
                                     uBoolean2 = obj;
                                  }
                               }
                            }
                            if (integer != null) {
                               uBoolean1 = integer;
                            }
                            if (!TextUtils.isEmpty(uBoolean1)) {
                               representati.mBackupUrls.add(uBoolean1);
                            }
                         }catch(java.lang.Exception e0){
                            p0.Q();
                            e0.printStackTrace();
                         }
                         uException.printStackTrace();
                         goto label_0027 ;
                      }
                   }
                   break;
                 case 0x648bf8c9:
                   if (obj.equals("m3u8Slice")) {
                      sTRING = JsonToken.STRING;
                      if (p0.J() != sTRING) {
                         p0.Q();
                      }else {
                         i1 = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[sTRING.ordinal()];
                         if (i1 != f) {
                            if (i1 != i) {
                               if (i1 != jsonToken) {
                                  p0.Q();
                               }else {
                                  uBoolean = Boolean.valueOf(p0.s());
                                  if (uBoolean instanceof String) {
                                     uBoolean2 = uBoolean;
                                  }
                               }
                            }else if(a.g(String.class, Integer.TYPE) || a.g(String.class, Integer.class)){
                               integer1 = Integer.valueOf(p0.v());
                               if (integer1 instanceof String) {
                                  integer = integer1;
                               }
                            }else if(a.g(String.class, Long.TYPE) || a.g(String.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof String) {
                                  integer = longx;
                               }
                            }else if(a.g(String.class, Double.TYPE) || a.g(String.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof String) {
                                  integer = uDouble;
                               }
                            }else if(a.g(String.class, Float.TYPE) || a.g(String.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                               if (uFloat instanceof String) {
                                  integer = uFloat;
                               }
                            }else {
                               p0.Q();
                            }
                         }else {
                            obj = p0.E();
                            if (obj instanceof String) {
                               integer = obj;
                            }
                         }
                      }
                      if (integer != null) {
                         integer2 = integer;
                      }
                      representati.mM3u8Slice = integer2;
                   }
                   break;
                 default:
             }
          }
       label_1594 :
          p0.Q();
       }
       p0.j();
       return representati;
    }
    public final VideoFeature readVideoFeature(a p0){
       JsonToken nUMBER;
       int i;
       Boolean uBoolean;
       Integer integer;
       Long longx;
       Double uDouble;
       VideoFeature obj = PatchProxy.applyOneRefs(p0, this, KwaiManifestTypeAdapter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new VideoFeature();
       p0.c();
       while (p0.l()) {
          String str = p0.y();
          if (str != null) {
             float f = 0;
             Float uFloat = null;
             switch (str.hashCode()){
                 case 0xb753493f:
                   if (str.equals("avgEntropy")) {
                      nUMBER = JsonToken.NUMBER;
                      if (p0.J() != nUMBER) {
                         p0.Q();
                      }else {
                         i = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[nUMBER.ordinal()];
                         if (i != 1) {
                            if (i != 2) {
                               if (i != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean = Boolean.valueOf(p0.s());
                                  if (uBoolean instanceof Float) {
                                     uFloat = uBoolean;
                                  }
                               }
                            }else if(a.g(Float.class, Integer.TYPE) || a.g(Float.class, Integer.class)){
                               integer = Integer.valueOf(p0.v());
                               if (integer instanceof Float) {
                                  uFloat = integer;
                               }
                            }else if(a.g(Float.class, Long.TYPE) || a.g(Float.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof Float) {
                                  uFloat = longx;
                               }
                            }else if(a.g(Float.class, Double.TYPE) || a.g(Float.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof Float) {
                                  uFloat = uDouble;
                               }
                            }else if(a.g(Float.class, Float.TYPE) || a.g(Float.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                            }else {
                               p0.Q();
                            }
                         }else {
                            str = p0.E();
                            if (str instanceof Float) {
                               uFloat = str;
                            }
                         }
                      }
                      if (uFloat != null) {
                         f = uFloat.floatValue();
                      }
                      obj.mAvgEntropy = f;
                   }
                   break;
                 case 0xc3b0c309:
                   if (str.equals("blockyProbability")) {
                      nUMBER = JsonToken.NUMBER;
                      if (p0.J() != nUMBER) {
                         p0.Q();
                      }else {
                         i = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[nUMBER.ordinal()];
                         if (i != 1) {
                            if (i != 2) {
                               if (i != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean = Boolean.valueOf(p0.s());
                                  if (uBoolean instanceof Float) {
                                     uFloat = uBoolean;
                                  }
                               }
                            }else if(a.g(Float.class, Integer.TYPE) || a.g(Float.class, Integer.class)){
                               integer = Integer.valueOf(p0.v());
                               if (integer instanceof Float) {
                                  uFloat = integer;
                               }
                            }else if(a.g(Float.class, Long.TYPE) || a.g(Float.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof Float) {
                                  uFloat = longx;
                               }
                            }else if(a.g(Float.class, Double.TYPE) || a.g(Float.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof Float) {
                                  uFloat = uDouble;
                               }
                            }else if(a.g(Float.class, Float.TYPE) || a.g(Float.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                            }else {
                               p0.Q();
                            }
                         }else {
                            str = p0.E();
                            if (str instanceof Float) {
                               uFloat = str;
                            }
                         }
                      }
                      if (uFloat != null) {
                         f = uFloat.floatValue();
                      }
                      obj.mBlockyProbability = f;
                   }
                   break;
                 case 0xf3b16a01:
                   if (str.equals("mosScore")) {
                      nUMBER = JsonToken.NUMBER;
                      if (p0.J() != nUMBER) {
                         p0.Q();
                      }else {
                         i = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[nUMBER.ordinal()];
                         if (i != 1) {
                            if (i != 2) {
                               if (i != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean = Boolean.valueOf(p0.s());
                                  if (uBoolean instanceof Float) {
                                     uFloat = uBoolean;
                                  }
                               }
                            }else if(a.g(Float.class, Integer.TYPE) || a.g(Float.class, Integer.class)){
                               integer = Integer.valueOf(p0.v());
                               if (integer instanceof Float) {
                                  uFloat = integer;
                               }
                            }else if(a.g(Float.class, Long.TYPE) || a.g(Float.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof Float) {
                                  uFloat = longx;
                               }
                            }else if(a.g(Float.class, Double.TYPE) || a.g(Float.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof Float) {
                                  uFloat = uDouble;
                               }
                            }else if(a.g(Float.class, Float.TYPE) || a.g(Float.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                            }else {
                               p0.Q();
                            }
                         }else {
                            str = p0.E();
                            if (str instanceof Float) {
                               uFloat = str;
                            }
                         }
                      }
                      if (uFloat != null) {
                         f = uFloat.floatValue();
                      }
                      obj.mMosScore = f;
                   }
                   break;
                 case 0x350a994e:
                   if (str.equals("blurProbability")) {
                      nUMBER = JsonToken.NUMBER;
                      if (p0.J() != nUMBER) {
                         p0.Q();
                      }else {
                         i = KwaiManifestTypeAdapter$WhenMappings.$EnumSwitchMapping$0[nUMBER.ordinal()];
                         if (i != 1) {
                            if (i != 2) {
                               if (i != 3) {
                                  p0.Q();
                               }else {
                                  uBoolean = Boolean.valueOf(p0.s());
                                  if (uBoolean instanceof Float) {
                                     uFloat = uBoolean;
                                  }
                               }
                            }else if(a.g(Float.class, Integer.TYPE) || a.g(Float.class, Integer.class)){
                               integer = Integer.valueOf(p0.v());
                               if (integer instanceof Float) {
                                  uFloat = integer;
                               }
                            }else if(a.g(Float.class, Long.TYPE) || a.g(Float.class, Long.class)){
                               longx = Long.valueOf(p0.x());
                               if (longx instanceof Float) {
                                  uFloat = longx;
                               }
                            }else if(a.g(Float.class, Double.TYPE) || a.g(Float.class, Double.class)){
                               uDouble = Double.valueOf(p0.u());
                               if (uDouble instanceof Float) {
                                  uFloat = uDouble;
                               }
                            }else if(a.g(Float.class, Float.TYPE) || a.g(Float.class, Float.class)){
                               uFloat = Float.valueOf((float)p0.u());
                            }else {
                               p0.Q();
                            }
                         }else {
                            str = p0.E();
                            if (str instanceof Float) {
                               uFloat = str;
                            }
                         }
                      }
                      if (uFloat != null) {
                         f = uFloat.floatValue();
                      }
                      obj.mBlurProbability = f;
                   }
                   break;
                 default:
             }
          }
       label_0373 :
          p0.Q();
       }
       p0.j();
       return obj;
    }
    public void write(b p0,KwaiManifest p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiManifestTypeAdapter.class, "1")) {
          return;
       }
       a.p(p0, "writer");
       if (p1 == null) {
          throw new IOException("value is null");
       }
       p0.e();
       p0.r("version");
       p0.O(p1.mVersion);
       p0.r("businessType");
       p0.M(Integer.valueOf(p1.mBusinessType));
       p0.r("mediaType");
       p0.M(Integer.valueOf(p1.mMediaType));
       p0.r("videoId");
       p0.O(p1.mVideoId);
       p0.r("hideAuto");
       p0.P(p1.mHideAuto);
       p0.r("manualDefaultSelect");
       p0.P(p1.mAutoDefaultSelect);
       p0.r("stereoType");
       p0.M(Integer.valueOf(p1.mStereoType));
       p0.r("adaptationSet");
       p0.c();
       KwaiManifest mAdaptationS = p1.mAdaptationSet;
       if (mAdaptationS != null) {
          Iterator iterator = mAdaptationS.iterator();
          while (iterator.hasNext()) {
             Adaptation uAdaptation = iterator.next();
             a.o(uAdaptation, "adaptation");
             this.writeAdaption(uAdaptation, p0);
          }
       }
       p0.g();
       if (p1.mPlayInfo != null) {
          p0.r("playInfo");
          mAdaptationS = p1.mPlayInfo;
          a.o(mAdaptationS, "value.mPlayInfo");
          this.writePlayInfo(mAdaptationS, p0);
       }
       if (p1.mVideoFeature != null) {
          p0.r("videoFeature");
          p1 = p1.mVideoFeature;
          a.o(p1, "value.mVideoFeature");
          this.writeVideoFeature(p1, p0);
       }
       p0.j();
       return;
    }
    public void write(b p0,Object p1){
       this.write(p0, p1);
    }
    public final void writeAdaption(Adaptation p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiManifestTypeAdapter.class, "8")) {
          return;
       }
       p1.e();
       p1.r("id");
       p1.K((long)p0.mId);
       p1.r("duration");
       p1.J((double)p0.mDurationMs);
       p1.r("vcodec");
       p1.O(p0.vcodec);
       p1.r("representation");
       p1.c();
       p0 = p0.mRepresentation;
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             Representation representati = iterator.next();
             a.o(representati, "representation");
             this.writeRepresentation(representati, p1);
          }
       }
       p1.g();
       p1.j();
       return;
    }
    public final void writeKvqScore(KvqScore p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiManifestTypeAdapter.class, "12")) {
          return;
       }
       p1.e();
       p1.r("FR");
       p1.M(Float.valueOf(p0.mFR));
       p1.r("NR");
       p1.M(Float.valueOf(p0.mNR));
       p1.j();
       return;
    }
    public final void writePlayInfo(PlayInfo p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiManifestTypeAdapter.class, "4")) {
          return;
       }
       p1.e();
       p1.r("disableAudio");
       p1.c();
       PlayInfo mDisableAudi = p0.mDisableAudio;
       if (mDisableAudi != null) {
          Iterator iterator = mDisableAudi.iterator();
          while (iterator.hasNext()) {
             p1.K((long)iterator.next().intValue());
          }
       }
       p1.g();
       p1.r("cdnTimeRangeLevel");
       p1.M(Integer.valueOf(p0.mCdnTimeRangeLevel));
       p1.j();
       return;
    }
    public final void writeRepresentation(Representation p0,b p1){
       Iterator iterator;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiManifestTypeAdapter.class, "10")) {
          return;
       }
       p1.e();
       p1.r("id");
       p1.M(Integer.valueOf(p0.mId));
       p1.r("url");
       p1.O(p0.mMailUrl);
       p1.r("backupUrl");
       p1.c();
       Representation mBackupUrls = p0.mBackupUrls;
       if (mBackupUrls != null) {
          iterator = mBackupUrls.iterator();
          while (iterator.hasNext()) {
             p1.O(iterator.next());
          }
       }
       p1.g();
       p1.r("m3u8Slice");
       p1.O(p0.mM3u8Slice);
       p1.r("maxBitrate");
       p1.M(Integer.valueOf(p0.maxBitrate));
       p1.r("avgBitrate");
       p1.M(Integer.valueOf(p0.avgBitrate));
       p1.r("codecs");
       p1.O(p0.codecs);
       p1.r("videoCodec");
       p1.O(p0.videoCodec);
       p1.r("width");
       p1.M(Integer.valueOf(p0.mWidth));
       p1.r("height");
       p1.M(Integer.valueOf(p0.mHeight));
       p1.r("frameRate");
       p1.M(Float.valueOf(p0.mFrameRate));
       p1.r("quality");
       p1.J((double)p0.mQuality);
       p1.r("qualityType");
       p1.O(p0.mQualityType);
       p1.r("qualityLabel");
       p1.O(p0.mQualityLabel);
       p1.r("minorInfo");
       p1.O(p0.mMinorInfo);
       p1.r("bitratePattern");
       p1.c();
       mBackupUrls = p0.bitratePattern;
       if (mBackupUrls != null) {
          iterator = mBackupUrls.iterator();
          while (iterator.hasNext()) {
             p1.K((long)iterator.next().intValue());
          }
       }
       p1.g();
       p1.r("featureP2sp");
       p1.P(p0.mFeatureP2sp);
       p1.r("hidden");
       p1.P(p0.mHidden);
       p1.r("disableAdaptive");
       p1.P(p0.mDisableAdaptive);
       p1.r("adaptiveType");
       p1.M(Integer.valueOf(p0.mAdaptiveType));
       p1.r("defaultSelect");
       p1.P(p0.mDefaultSelect);
       p1.r("comment");
       p1.O(p0.mComment);
       p1.r("hdrType");
       p1.M(Integer.valueOf(p0.mDynamicType));
       if (p0.mKvqScore != null) {
          p1.r("kvqScore");
          mBackupUrls = p0.mKvqScore;
          a.o(mBackupUrls, "representation.mKvqScore");
          this.writeKvqScore(mBackupUrls, p1);
       }
       p1.r("cacheKey");
       p1.O(p0.cacheKey);
       p1.j();
       return;
    }
    public final void writeVideoFeature(VideoFeature p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiManifestTypeAdapter.class, "6")) {
          return;
       }
       p1.e();
       p1.r("mosScore");
       p1.M(Float.valueOf(p0.mMosScore));
       p1.r("avgEntropy");
       p1.M(Float.valueOf(p0.mAvgEntropy));
       p1.r("blockyProbability");
       p1.M(Float.valueOf(p0.mBlockyProbability));
       p1.r("blurProbability");
       p1.M(Float.valueOf(p0.mBlurProbability));
       p1.j();
       return;
    }
}
