package com.horcrux.svg.TextLayoutAlgorithm$CharacterInformation;
import com.horcrux.svg.TextLayoutAlgorithm;
import java.lang.Object;

public class TextLayoutAlgorithm$CharacterInformation	// class@000605
{
    public boolean addressable;
    public double advance;
    public boolean anchoredChunk;
    public char character;
    public TextView element;
    public boolean firstCharacterInResolvedDescendant;
    public boolean hidden;
    public int index;
    public boolean middle;
    public boolean resolved;
    public double rotate;
    public boolean rotateSpecified;
    public final TextLayoutAlgorithm this$0;
    public double x;
    public boolean xSpecified;
    public double y;
    public boolean ySpecified;

    public void TextLayoutAlgorithm$CharacterInformation(TextLayoutAlgorithm p0,int p1,char p2){
       this.this$0 = p0;
       super();
       this.x = 0;
       this.y = 0;
       this.rotate = 0;
       this.hidden = false;
       this.middle = false;
       this.resolved = false;
       this.xSpecified = false;
       this.ySpecified = false;
       this.addressable = true;
       this.anchoredChunk = false;
       this.rotateSpecified = false;
       this.firstCharacterInResolvedDescendant = false;
       this.index = p1;
       this.character = p2;
    }
}
