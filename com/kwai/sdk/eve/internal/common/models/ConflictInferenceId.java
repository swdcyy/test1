package com.kwai.sdk.eve.internal.common.models.ConflictInferenceId;
import java.lang.Exception;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class ConflictInferenceId extends Exception	// class@001479
{
    public final String id;

    public void ConflictInferenceId(String p0){
       a.p(p0, "id");
       super("Id "+p0+" already exists");
       this.id = p0;
    }
    public final String getId(){
       return this.id;
    }
}
