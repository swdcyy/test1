package com.kuaishou.live.core.voiceparty.micseats.core.pendant.MicSeatPendantConfigProcessor;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import com.kuaishou.live.core.voiceparty.micseats.core.pendant.MicSeatPendantConfigProcessor$priority$1;
import java.util.Map;
import msd.l;
import trd.r0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.res.Resources;
import java.io.InputStream;
import zsd.d;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.io.BufferedReader;
import java.io.Reader;
import kotlin.io.TextStreamsKt;
import org.json.JSONObject;
import org.json.JSONArray;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import java.lang.Integer;
import java.util.LinkedHashSet;
import java.util.Set;

public final class MicSeatPendantConfigProcessor	// class@00158d
{
    public final Map a;
    public final Map b;
    public final Context c;

    public void MicSeatPendantConfigProcessor(Context p0){
       String str1;
       a.p(p0, "context");
       super();
       this.c = p0;
       this.a = r0.c(new LinkedHashMap(), MicSeatPendantConfigProcessor$priority$1.INSTANCE);
       this.b = new LinkedHashMap();
       if (PatchProxy.applyVoid(null, this, MicSeatPendantConfigProcessor.class, "2")) {
       }else {
          InputStream inputStream = p0.getResources().openRawResource(R.raw.arg_RES_7f0f0097);
          a.o(inputStream, "context\n      .resources¡­_mic_seat_pendant_config\)");
          InputStreamReader inputStreamR = new InputStreamReader(inputStream, d.a);
          String str = 8192;
          if (inputStreamR instanceof BufferedReader) {
          }else {
             inputStreamR = new BufferedReader(inputStreamR, str);
          }
          JSONObject jSONObject = new JSONObject(TextStreamsKt.k(inputStreamR));
          JSONArray jSONArray = jSONObject.getJSONArray("priority");
          int i = jSONArray.length();
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             str1 = jSONArray.optString(i1);
             a.o(str1, "jsonPriorityArray.optString\(i\)");
             this.a.put(MicSeatPendantId.valueOf(str1), Integer.valueOf(i1));
          }
          jSONArray = jSONObject.getJSONArray("repulsion");
          int i2 = jSONArray.length();
          for (i = 0; i < i2; i = i + 1) {
             JSONObject jSONObject1 = jSONArray.optJSONObject(i);
             str1 = jSONObject1.getString("pendantId");
             a.o(str1, "jsonRepulsionObject.getString\(\"pendantId\"\)");
             MicSeatPendantId micSeatPenda = MicSeatPendantId.valueOf(str1);
             LinkedHashSet linkedHashSe = new LinkedHashSet();
             JSONArray jSONArray1 = jSONObject1.getJSONArray("exclude");
             int i3 = jSONArray1.length();
             for (int i4 = 0; i4 < i3; i4 = i4 + 1) {
                String str2 = jSONArray1.getString(i4);
                a.o(str2, "jsonExcludeArray.getString\(j\)");
                linkedHashSe.add(MicSeatPendantId.valueOf(str2));
             }
             this.b.put(micSeatPenda, linkedHashSe);
          }
       }
       return;
    }
}
