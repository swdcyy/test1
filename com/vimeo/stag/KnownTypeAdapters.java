package com.vimeo.stag.KnownTypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$1;
import com.google.gson.TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$2;
import com.vimeo.stag.KnownTypeAdapters$3;
import com.vimeo.stag.KnownTypeAdapters$4;
import com.vimeo.stag.KnownTypeAdapters$5;
import com.vimeo.stag.KnownTypeAdapters$6;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$b;
import bl.p;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$7;
import com.vimeo.stag.KnownTypeAdapters$8;
import com.vimeo.stag.KnownTypeAdapters$9;
import com.vimeo.stag.KnownTypeAdapters$10;

public final class KnownTypeAdapters	// class@001003
{
    public static final TypeAdapter a;
    public static final TypeAdapter b;
    public static final TypeAdapter c;
    public static final TypeAdapter d;
    public static final TypeAdapter e;
    public static final TypeAdapter f;
    public static final TypeAdapter g;
    public static final TypeAdapter h;
    public static final TypeAdapter i;
    public static final TypeAdapter j;
    public static final TypeAdapter k;
    public static final TypeAdapter l;
    public static final TypeAdapter m;
    public static final TypeAdapter n;
    public static final TypeAdapter o;
    public static final TypeAdapter p;
    public static final TypeAdapter q;
    public static final TypeAdapter r;
    public static final TypeAdapter s;

    static {
       TypeAdapter typeAdapter = new KnownTypeAdapters$1().nullSafe();
       KnownTypeAdapters.a = typeAdapter;
       TypeAdapter typeAdapter1 = new KnownTypeAdapters$2().nullSafe();
       KnownTypeAdapters.b = typeAdapter1;
       TypeAdapter typeAdapter2 = new KnownTypeAdapters$3().nullSafe();
       KnownTypeAdapters.c = typeAdapter2;
       TypeAdapter typeAdapter3 = new KnownTypeAdapters$4().nullSafe();
       KnownTypeAdapters.d = typeAdapter3;
       TypeAdapter typeAdapter4 = new KnownTypeAdapters$5().nullSafe();
       KnownTypeAdapters.e = typeAdapter4;
       TypeAdapter typeAdapter5 = new KnownTypeAdapters$6().nullSafe();
       KnownTypeAdapters.f = typeAdapter5;
       KnownTypeAdapters.g = new KnownTypeAdapters$ListTypeAdapter(typeAdapter2, new KnownTypeAdapters$b());
       KnownTypeAdapters.h = new KnownTypeAdapters$ListTypeAdapter(typeAdapter3, new KnownTypeAdapters$b());
       KnownTypeAdapters.i = new KnownTypeAdapters$ListTypeAdapter(typeAdapter5, new KnownTypeAdapters$b());
       KnownTypeAdapters.j = new KnownTypeAdapters$ListTypeAdapter(typeAdapter1, new KnownTypeAdapters$b());
       KnownTypeAdapters.k = new KnownTypeAdapters$ListTypeAdapter(typeAdapter4, new KnownTypeAdapters$b());
       KnownTypeAdapters.l = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.e, new KnownTypeAdapters$b());
       KnownTypeAdapters.m = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$b());
       KnownTypeAdapters.n = TypeAdapters.A.nullSafe();
       KnownTypeAdapters.o = TypeAdapters.X.nullSafe();
       KnownTypeAdapters.p = new KnownTypeAdapters$7().nullSafe();
       KnownTypeAdapters.q = new KnownTypeAdapters$8().nullSafe();
       KnownTypeAdapters.r = new KnownTypeAdapters$9().nullSafe();
       KnownTypeAdapters.s = new KnownTypeAdapters$10().nullSafe();
    }
}
