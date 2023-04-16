package com.kwai.logger.upload.internal.ResponseGsons;
import zk.d;
import v87.b;
import com.kwai.logger.upload.internal.ResponseGsons$ResponseDeserializer;
import com.kwai.logger.upload.internal.ResponseGsons$a;
import java.lang.reflect.Type;
import java.lang.Object;
import com.google.gson.Gson;

public class ResponseGsons	// class@000eca
{
    public static final Gson a;

    static {
       d uod = new d();
       uod.f(b.class, new ResponseGsons$ResponseDeserializer(null));
       ResponseGsons.a = uod.b();
    }
}
