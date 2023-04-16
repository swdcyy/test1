package com.kwai.framework.logger.uploader.h;
import er.j;
import com.kwai.framework.logger.uploader.a;
import android.content.Context;
import java.lang.String;
import com.kuaishou.android.vader.Channel;
import java.lang.Class;
import java.util.List;
import er.k;
import com.kuaishou.android.vader.config.LogResponse;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bw.a$a;
import com.google.protobuf.nano.MessageNano;
import w96.d;
import java.lang.Throwable;
import q87.c;
import bw.a$b;
import com.kuaishou.android.vader.persistent.LogRecord;
import java.lang.StringBuilder;
import org.json.JSONObject;
import wkd.b;
import com.yxcorp.gifshow.log.h;

public class h extends a implements j	// class@00167f
{
    public final String k;

    public void h(Context p0,String p1,Channel p2){
       super(h.class.getSimpleName(), p2);
       this.k = p1;
    }
    public LogResponse c(List p0,k p1){
       LogResponse obj = PatchProxy.applyTwoRefs(p0, p1, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       try{
          a$a uoa = this.m(p0);
          if (!uoa.a.length) {
             return obj;
          }
          return this.i(uoa, this.k, false, p1);
       }catch(java.lang.Exception e4){
          d.C().r(this.b, "exception", e4);
          return obj;
       }
    }
    public final a$a m(List p0){
       a$a obj = PatchProxy.applyOneRefs(p0, this, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a$a();
       a$b[] uobArray = new a$b[p0.size()];
       obj.a = uobArray;
       int i = 0;
       while (i < p0.size()) {
          LogRecord logRecord = p0.get(i);
          try{
             obj.a[i] = MessageNano.mergeFrom(new a$b(), logRecord.payload());
             a$a a = obj.a;
             if (!a[i].b) {
                a[i].b = (long)logRecord.customSeqId();
             }
             obj.a[i].a = logRecord.clientTimestamp();
             Object[] objArray = new Object[0];
             d.C().w(this.b, "immediatelyUploaderUserTrackLog 1s channel uploadUserTrackLog client_increment_id = "+obj.a[i].b+"   relation_log_id = "+obj.a[i].y, objArray);
          }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e0){
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("type", "Exception");
             jSONObject.put("reason", "pb·´ÐòÁÐ»¯Ê§°Ü");
             b.a(0x4b316083).f1("v2_upload_parse_e", jSONObject.toString(), 1);
          }
          i = i + 1;
       }
       return obj;
    }
}
