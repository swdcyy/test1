package com.google.protobuf.Syntax$SyntaxVerifier;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.google.protobuf.Syntax;

public final class Syntax$SyntaxVerifier implements Internal$EnumVerifier	// class@0004c5
{
    public static final Internal$EnumVerifier INSTANCE;

    static {
       Syntax$SyntaxVerifier.INSTANCE = new Syntax$SyntaxVerifier();
    }
    public void Syntax$SyntaxVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (Syntax.forNumber(p0) != null)? true: false;
       return b;
    }
}
