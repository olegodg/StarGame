package ru.geekbrains.math;

import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class MatrixUtils {
    private MatrixUtils(){}
    public static void calaculatingTransitionMatrix(Matrix4 mat, Rect src,Rect dst){
        float scaleX = dst.getWidth()/ src.getWidth();
        float scaleY = dst.getHeight()/ src.getHeight();
        mat.idt().translate(dst.possition.x, dst.possition.y,0f).scale(scaleX,scaleY,1f).translate(-src.possition.x,-src.possition.y,0f);
    }
    public static void calaculatingTransitionMatrix(Matrix3 mat, Rect src, Rect dst){
        float scaleX = dst.getWidth()/ src.getWidth();
        float scaleY = dst.getHeight()/ src.getHeight();
        mat.idt().translate(dst.possition.x, dst.possition.y).scale(scaleX,scaleY).translate(-src.possition.x,-src.possition.y);
    }
}
