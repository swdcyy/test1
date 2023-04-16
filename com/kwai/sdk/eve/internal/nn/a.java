package com.kwai.sdk.eve.internal.nn.a;
import en7.o;
import com.kwai.sdk.eve.internal.nn.a$a;
import nsd.u;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nn7.b$a;
import qrd.l1;
import zsd.u;
import on7.a;
import pn7.a;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import java.lang.IllegalStateException;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import nn7.b;
import com.kwai.sdk.eve.internal.nn.TensorBufferCache;
import java.nio.ByteBuffer;
import nn7.c;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import com.kwai.sdk.eve.internal.nn.TensorBufferCache$a;
import kotlin.Pair;
import java.nio.Buffer;
import qrd.r0;
import usd.k;
import usd.q;
import java.util.LinkedHashMap;
import java.lang.Iterable;
import trd.u;
import trd.s0;
import java.util.Iterator;
import java.lang.Number;
import java.util.Map;
import java.util.Set;
import java.util.Map$Entry;
import com.kwai.sdk.eve.internal.nn.InferenceException;
import java.lang.Throwable;

public final class a extends o	// class@001579
{
    public final b$a b;
    public final b c;
    public TensorBufferCache d;
    public ByteBuffer[] e;
    public Map f;
    public static final a$a g;

    static {
       a.g = new a$a(null);
    }
    public void a(File p0){
       a uoa1;
       a.p(p0, "model");
       super();
       b$a uoa = new b$a();
       uoa.a = 1;
       this.b = uoa;
       String name = p0.getName();
       String str = "model.name";
       a.o(name, str);
       if (u.H1(name, ".knn", false, 2, null)) {
          uoa1 = new a(p0, uoa);
       }else {
          name = p0.getName();
          a.o(name, str);
          if (u.H1(name, ".tflite", false, 2, null)) {
             uoa1 = new a(p0, uoa);
          }else {
             throw new IllegalStateException("unknown model type");
          }
       }
       this.c = uoa1;
       EveLog.i$default("NNInterpreter#doCreate", false, 2, null);
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "10")) {
          return;
       }
       EveLog.i$default("NNInterpreter#dorelease", false, 2, null);
       this.c.close();
       return;
    }
    public final void d(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       TensorBufferCache tensorBuffer = this.e(p0);
       int inputTensorC = p0.getInputTensorCount();
       ByteBuffer[] uByteBufferA = new ByteBuffer[inputTensorC];
       for (int i = 0; i < inputTensorC; i = i + 1) {
          uByteBufferA[i] = tensorBuffer.getOrPutBuffer(p0.getInputTensor(i));
       }
       this.e = uByteBufferA;
       return;
    }
    public final TensorBufferCache e(b p0){
       p0 = PatchProxy.applyOneRefs(p0, this, a.class, "9");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       if (this.d == null) {
          TensorBufferCache$a companion = TensorBufferCache.Companion;
          Objects.requireNonNull(companion);
          TensorBufferCache tensorBuffer = PatchProxy.apply(null, companion, TensorBufferCache$a.class, "1");
          if (tensorBuffer != PatchProxyResult.class) {
          }else {
             tensorBuffer = new TensorBufferCache(null);
          }
          this.d = tensorBuffer;
       }
       a td = this.d;
       a.m(td);
       return td;
    }
    public final Pair f(){
       a obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.d(this.c);
       int inputTensorC = this.c.getInputTensorCount();
       c[] uocArray = new c[inputTensorC];
       int i = 0;
       for (int i1 = 0; i1 < inputTensorC; i1 = i1 + 1) {
          uocArray[i1] = this.c.getInputTensor(i1);
       }
       obj = this.e;
       a.m(obj);
       i1 = obj.length;
       for (; i < i1; i = i + 1) {
          obj[i].rewind();
       }
       return r0.a(uocArray, obj);
    }
    public final Pair g(){
       a uoa = a.class;
       a obj = PatchProxy.apply(null, this, uoa, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       int i = 0;
       if (!PatchProxy.applyVoidOneRefs(obj, this, uoa, "8")) {
          TensorBufferCache tensorBuffer = this.e(obj);
          k ok = q.n1(i, obj.getOutputTensorCount());
          LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(u.Y(ok, 10)), 16));
          Iterator iterator1 = ok.iterator();
          while (iterator1.hasNext()) {
             Object obj1 = iterator1.next();
             linkedHashMa.put(obj1, tensorBuffer.getOrPutBuffer(obj.getOutputTensor(obj1.intValue())));
          }
          this.f = linkedHashMa;
       }
       uoa = this.f;
       a.m(uoa);
       Iterator iterator = uoa.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          uEntry.getKey().intValue();
          uEntry.getValue().rewind();
       }
       int outputTensor = this.c.getOutputTensorCount();
       c[] uocArray = new c[outputTensor];
       for (; i < outputTensor; i = i + 1) {
          uocArray[i] = this.c.getOutputTensor(i);
       }
       uoa = this.f;
       a.m(uoa);
       return r0.a(uocArray, uoa);
    }
    public final Pair h(ByteBuffer[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "input");
       Pair pair = this.g();
       this.c.runForMultipleInputsOutputs(p0, pair.getSecond());
       return pair;
    }
}
