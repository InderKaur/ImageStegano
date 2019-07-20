/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.awt.image.IndexColorModel;

/**
 * This class acts like data file providing indexColorTable of 8 different types
 * Used for color map
 * @author anuj lakshay neetu
 */
public class CustomIndexColorModel {
    
    private IndexColorModel[] icm = new IndexColorModel[8];
    
    
    public CustomIndexColorModel() {
        byte reds[] = new byte[] {
            -20, -20, -20, -20, -20, -20, -20, -24, -24, -24, -24, -24, -24, -24, -28, -28, -28, -28, -28, -28, -28, -32, -32, -32, -32, -32, -32, -32, -32, -36, -36, -36, -36, -36, -36, -36, -40, -40, -40, -40, -40, -40, -40, -44, -44, -44, -44, -44, -44, -44, -48, -48, -48, -48, -48, -48, -48, -52, -52, -52, -52, -52, -52, -52, -52, -56, -56, -56, -56, -56, -56, -56, -56, -56, -56, -56, -56, -56, -56, -56, -56, -56, -56, -56, -60, -60, -60, -60, -60, -60, -60, -60, -60, -60, -60, -60, -60, -60, -60, -60, -60, -60, -60, -60, -64, -64, -64, -64, -64, -64, -64, -64, -64, -64, -64, -64, -64, -64, -64, -64, -64, -64, -64, -68, -68, -68, -68, -68, -68, -68, -68, -68, -68, -68, -68, -68, -68, -68, -68, -68, -68, -68, -68, -108, 112, 116, 116, 116, 120, 120, 120, 120, 124, 124, 124, 124, -128, -128, -128, -124, -124, -124, -124, -120, -120, -120, -120, -116, -116, -116, -112, -112, -112, -112, -108, -108, -108, -108, -104, -104, -104, -100, -100, -100, -100, -96, -96, -96, -96, -92, -92, -92, -88, -88, -88, -88, -84, -84, -84, -84, -80, -80, -80, -80, -88, -92, -100, -104, -108, -116, -120, -124, 124, 120, 116, 108, 104, 100, 92, 88, 80, 76, 72, 64, 60, 56, 48, 44, 40, 32, 28, 24, 16, 12, 8, 12, 16, 20, 20, 24, 28, 28, 32, 36, 36, 40, 44, 44, 48, 52, 52, 56, 60, 60, 64, 68
        };
        byte greens[] = new byte[] {
            -40, -40, -40, -44, -44, -48, -48, -52, -52, -52, -56, -56, -60, -60, -64, -64, -68, -68, -72, -72, -72, -76, -76, -80, -80, -84, -84, -88, -88, -92, -92, -92, -96, -96, -100, -100, -104, -104, -108, -108, -112, -112, -112, -116, -116, -120, -120, -124, -124, -128, -128, 124, 124, 124, 120, 120, 116, 116, 112, 112, 108, 108, 104, 104, 104, 108, 108, 108, 108, 108, 108, 108, 112, 112, 112, 112, 112, 112, 112, 116, 116, 116, 116, 116, 116, 116, 120, 120, 120, 120, 120, 120, 120, 124, 124, 124, 124, 124, 124, 124, -128, -128, -128, -128, -128, -128, -128, -124, -124, -124, -124, -124, -124, -124, -120, -120, -120, -120, -120, -120, -120, -116, -116, -116, -116, -116, -116, -116, -112, -112, -112, -112, -112, -112, -112, -108, -108, -108, -108, -108, -108, -108, -108, -120, 124, -128, -128, -128, -128, -128, -128, -128, -124, -124, -124, -124, -124, -124, -124, -120, -120, -120, -120, -120, -120, -120, -120, -116, -116, -116, -116, -116, -116, -116, -112, -112, -112, -112, -112, -112, -112, -108, -108, -108, -108, -108, -108, -108, -108, -104, -104, -104, -104, -104, -104, -104, -100, -100, -100, -100, -100, -100, -100, -100, -104, -108, -108, -112, -112, -116, -116, -120, -120, -124, -124, -128, -128, 124, 124, 120, 120, 116, 116, 112, 112, 108, 108, 104, 104, 100, 100, 96, 96, 92, 92, 88, 88, 88, 88, 84, 84, 84, 84, 84, 80, 80, 80, 80, 76, 76, 76, 76, 76, 72, 72, 72
        };
        byte blues[] = new byte[] {
            20, 20, 20, 20, 20, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 40, 40, 40, 40, 40, 40, 40, 40, 40, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 24, 24, 24, 24, 24, 24, 24, 24, 24, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 60, 108, 112, 112, 116, 116, 120, 120, 124, 124, -128, -128, -124, -124, -120, -120, -116, -116, -112, -112, -108, -108, -104, -104, -100, -100, -96, -96, -92, -92, -88, -88, -84, -84, -80, -80, -76, -76, -72, -72, -68, -68, -64, -64, -60, -60, -56, -56, -52, -52, -48, -48, -44, -44, -40, -40, -36, -36, -32, -32, -32, -36, -40, -44, -44, -48, -52, -52, -56, -60, -60, -64, -68, -68, -72, -76, -76, -80, -84, -84, -88, -92, -92, -96, -100, -100, -104, -108, -108, -112, -116, -116, -120, -120, -120, -124, -124, -124, -128, -128, -128, -128, 124, 124, 124, 120, 120, 120, 116, 116, 116, 116, 112
        };
        icm[0] = new IndexColorModel(8, 256, reds, greens, blues);
        
        reds = new byte[] {
            108, 108, 108, 104, 104, 100, 96, 96, 92, 92, 88, 84, 84, 80, 76, 80, 84, 88, 92, 96, 100, 104, 108, 112, 116, 120, 124, -128, -124, -120, -116, -112, -108, -104, -100, -96, -92, -88, -84, -80, -76, -72, -68, -64, -60, -56, -52, -48, -44, -40, -36, -40, -40, -40, -44, -44, -44, -44, -48, -48, -48, -48, -52, -52, -52, -56, -56, -56, -56, -60, -60, -60, -60, -64, -64, -64, -68, -68, -68, -68, -72, -72, -72, -72, -76, -76, -76, -80, -80, -80, -80, -84, -84, -84, -84, -88, -88, -88, -92, -92, -92, -92, -96, -96, -96, -96, -100, -100, -100, -104, -104, -104, -104, -108, -108, -108, -108, -112, -112, -112, -116, -116, -116, -116, -120, -120, -120, -120, -124, -124, -124, -128, -128, -128, -128, 124, 124, 124, 124, 120, 120, 120, 116, 116, 116, 116, 112, 112, 112, 112, 108, 108, 108, 104, 104, 104, 104, 100, 100, 100, 100, 96, 96, 96, 92, 92, 92, 92, 88, 88, 88, 88, 84, 84, 84, 80, 80, 80, 80, 76, 76, 76, 76, 72, 72, 72, 68, 68, 68, 68, 64, 64, 64, 64, 60, 60, 60, 56, 56, 56, 56, 52, 52, 52, 52, 48, 48, 48, 44, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 56, 56, 56, 56, 56, -96, -100, -100, -104, -104, -108, -112, -112, -116, -116, -120, -124, -124, -128, -128, 124, 120, 120, 116, 116, 112
        };
        greens = new byte[] {
            88, 88, 88, 92, 92, 92, 92, 96, 96, 96, 96, 100, 100, 100, 96, 100, 104, 104, 108, 112, 112, 116, 116, 120, 124, 124, -128, -128, -124, -120, -120, -116, -116, -112, -108, -108, -104, -100, -100, -96, -96, -92, -88, -88, -84, -84, -80, -76, -76, -72, -72, -76, -76, -76, -76, -76, -76, -76, -76, -80, -80, -80, -80, -80, -80, -80, -80, -80, -84, -84, -84, -84, -84, -84, -84, -84, -84, -88, -88, -88, -88, -88, -88, -88, -88, -88, -92, -92, -92, -92, -92, -92, -92, -92, -96, -96, -96, -96, -96, -96, -96, -96, -96, -100, -100, -100, -100, -100, -100, -100, -100, -100, -104, -104, -104, -104, -104, -104, -104, -104, -104, -108, -108, -108, -108, -108, -108, -108, -108, -108, -112, -112, -112, -112, -112, -112, -112, -112, -116, -116, -116, -116, -116, -116, -116, -116, -116, -120, -120, -120, -120, -120, -120, -120, -120, -120, -124, -124, -124, -124, -124, -124, -124, -124, -124, -128, -128, -128, -128, -128, -128, -128, -128, 124, 124, 124, 124, 124, 124, 124, 124, 124, 120, 120, 120, 120, 120, 120, 120, 120, 120, 116, 116, 116, 116, 116, 116, 116, 116, 116, 112, 112, 112, 112, 112, 112, 112, 112, 116, 112, 112, 112, 112, 112, 112, 112, 112, 112, 112, 112, 112, 112, 112, 112, 112, 112, 112, 112, 112, 112, 112, 112, 112, 112, 112, 68, 68, 68, 72, 72, 72, 72, 76, 76, 76, 76, 80, 80, 80, 80, 84, 84, 84, 84, 88, 88
        };
        blues = new byte[] {
            -128, -128, -128, -124, -124, -124, -124, -120, -120, -120, -120, -116, -116, -116, -120, -116, -112, -108, -108, -104, -100, -96, -96, -92, -88, -88, -84, -80, -76, -76, -72, -68, -68, -64, -60, -56, -56, -52, -48, -44, -44, -40, -36, -36, -32, -28, -24, -24, -20, -16, -16, -20, -20, -20, -20, -20, -20, -20, -24, -24, -24, -24, -24, -24, -24, -24, -28, -28, -28, -28, -28, -28, -28, -28, -32, -32, -32, -32, -32, -32, -32, -32, -36, -36, -36, -36, -36, -36, -36, -36, -40, -40, -40, -40, -40, -40, -40, -40, -44, -44, -44, -44, -44, -44, -44, -44, -48, -48, -48, -48, -48, -48, -48, -48, -52, -52, -52, -52, -52, -52, -52, -52, -56, -56, -56, -56, -56, -56, -56, -56, -60, -60, -60, -60, -60, -60, -60, -64, -64, -64, -64, -64, -64, -64, -64, -68, -68, -68, -68, -68, -68, -68, -68, -72, -72, -72, -72, -72, -72, -72, -72, -76, -76, -76, -76, -76, -76, -76, -76, -80, -80, -80, -80, -80, -80, -80, -80, -84, -84, -84, -84, -84, -84, -84, -84, -88, -88, -88, -88, -88, -88, -88, -88, -92, -92, -92, -92, -92, -92, -92, -92, -96, -96, -96, -96, -96, -96, -96, -100, -96, -96, -96, -96, -96, -96, -96, -96, -96, -96, -96, -96, -96, -96, -96, -96, -96, -96, -96, -96, -96, -96, -96, -96, -96, -96, 108, 108, 108, 112, 112, 112, 112, 116, 116, 116, 116, 120, 120, 120, 120, 124, 124, 124, 124, -128, -128
        };
        icm[1] = new IndexColorModel(8, 256, reds, greens, blues);
        
        reds = new byte[] {
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 8, 8, 12, 12, 16, 16, 20, 20, 24, 24, 28, 28, 32, 32, 36, 36, 40, 40, 44, 44, 48, 48, 52, 52, 56, 56, 60, 60, 64, 64, 68, 68, 72, 72, 76, 76, 80, 80, 84, 84, 88, 88, 92, 92, 96, 100, 100, 104, 104, 108, 108, 112, 112, 116, 116, 120, 120, 124, 124, -128, -128, -124, -124, -120, -120, -116, -116, -112, -112, -108, -108, -104, -104, -100, -100, -96, -96, -92, -92, -88, -88, -84, -84, -80, -80, -76, -76, -72, -72, -68, -68, -64, -60, -60, -60, -60, -60, -56, -56, -56, -56, -56, -52, -52, -52, -52, -48, -48, -48, -48, -48, -44, -44, -44, -44, -40, -40, -40, -40, -40, -36, -36, -36, -36, -32, -32, -32, -32, -32, -28, -28, -28, -28, -28, -24, -24, -24, -24, -20, -20, -20, -20, -20, -16, -16, -16, -16, -12, -12, -12, -12, -12, -8, -8, -8, -8, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4
        };
        greens = new byte[] {
            -84, -84, -84, -88, -92, -96, -100, -104, -104, -108, -112, -116, -120, -124, -124, -128, 124, 120, 116, 112, 112, 108, 104, 100, 96, 92, 92, 88, 84, 80, 76, 72, 68, 64, 60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 4, 4, 4, 4, 8, 8, 8, 8, 12, 12, 12, 12, 16, 16, 16, 16, 20, 20, 20, 20, 24, 24, 24, 24, 24, 28, 28, 28, 28, 32, 32, 32, 32, 36, 36, 36, 36, 40, 40, 40, 40, 44, 44, 44, 44, 48, 48, 48, 48, 48, 52, 52, 52, 52, 56, 56, 56, 56, 60, 60, 60, 60, 64, 64, 64, 64, 68, 68, 68, 68, 72, 72, 72, 72, 72, 76, 76, 76, 76, 80, 80, 80, 80, 84, 84, 84, 84, 88, 88, 88, 88, 92, 92, 92, 92, 96, 96, 100, 100, 104, 108, 108, 112, 112, 116, 120, 120, 124, 124, -128, -124, -124, -120, -120, -116, -112, -112, -108, -104, -104, -100, -100, -96, -92, -92, -88, -88, -84, -80, -80, -76, -76, -72, -68, -68, -64, -64, -60, -56, -56, -52, -48, -48, -44, -44, -40, -36, -36, -32, -32, -28, -24, -24, -20, -20, -16, -12, -12, -8, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4
        };
        blues = new byte[] {
            -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -8, -8, -12, -16, -16, -20, -24, -24, -28, -32, -32, -36, -40, -40, -44, -44, -48, -52, -52, -56, -60, -60, -64, -68, -68, -72, -76, -76, -80, -84, -84, -88, -88, -92, -96, -96, -100, -104, -104, -108, -112, -112, -116, -120, -120, -124, -128, -128, 124, 124, 120, 116, 116, 112, 108, 108, 104, 100, 100, 96, 92, 92, 88, 88, 84, 80, 80, 76, 72, 72, 68, 64, 64, 60, 56, 56, 52, 48, 48, 44, 44, 40, 36, 36, 32, 28, 28, 24, 20, 20, 16, 12, 12, 8, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0, 104, 104, 108, 112, 116, 120, 120, 124, -128, -124, -120, -120, -116, -112, -108, -104, -104, -100, -96, -92, -88, -88, -84, -80, -76, -72, -72, -68, -64, -60, -56, -56, -52, -48, -44, -40, -40, -36, -32, -28, -24, -24, -20, -16, -12, -8, -4
        };
        icm[2] = new IndexColorModel(8, 256, reds, greens, blues);
        
        reds = new byte[] {
            56, 52, 52, 52, 52, 48, 48, 48, 48, 44, 44, 44, 44, 44, 40, 40, 40, 40, 36, 36, 36, 36, 32, 32, 32, 32, 28, 28, 28, 28, 24, 24, 24, 24, 24, 60, 96, -128, -92, -56, -24, -28, -28, -32, -32, -32, -36, -36, -36, -40, -40, -40, -44, -44, -48, -48, -48, -52, -52, -52, -56, -56, -56, -60, -64, -68, -72, 76, 72, 64, 60, 56, 60, 64, 64, 68, 68, 72, 76, 76, 80, 80, 84, 88, 88, 92, 92, 96, 100, 100, 104, 104, 108, 112, 112, 116, 116, 120, 120, 124, -128, -128, -124, -124, -120, -116, -116, -112, -112, -108, -104, -104, -100, -100, -96, -92, -92, -88, -88, -84, -80, -80, -76, -76, -72, -72, -68, -64, -64, -60, -60, -56, -52, -52, -48, -48, -44, -40, -40, -36, -36, -32, -28, -28, -24, -24, -20, -20, -24, -28, -32, -36, -40, -44, -44, -48, -52, -56, -60, -64, -68, -68, -72, -76, -80, -84, -88, -92, -92, -96, -100, -104, -108, -112, -116, -116, -120, -124, -128, 124, 120, 116, 116, 112, 108, 104, 100, 96, 96, 92, 92, 92, 92, 92, 92, 92, 88, 88, 88, 88, 88, 88, 88, 88, 84, 84, 84, 84, 84, 84, 84, 84, 80, 80, 80, 80, 80, 80, 80, 80, 76, 76, 76, 76, 76, 76, 76, 76, 72, 72, 72, 72, 72, 72, 72, 72, 68, 68, 68, 68, 68, 68, 68, 68, 64, 64, 64, 64, 60, 60, 60, 60, 56, 56, 56, 56
        };
        greens = new byte[] {
            104, 104, 104, 104, 104, 104, 104, 100, 100, 100, 100, 100, 100, 100, 100, 100, 96, 96, 96, 96, 96, 96, 96, 96, 96, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 108, 120, -124, -108, -96, -84, -88, -92, -96, -100, -104, -108, -112, -112, -116, -120, -124, -128, 124, 120, 120, 116, 112, 108, 104, 100, 96, 96, 100, 104, 108, 112, -60, -56, -52, -48, -48, -52, -52, -52, -56, -56, -56, -56, -60, -60, -60, -60, -64, -64, -64, -64, -68, -68, -68, -68, -72, -72, -72, -76, -76, -76, -76, -80, -80, -80, -80, -84, -84, -84, -84, -88, -88, -88, -88, -92, -92, -92, -96, -96, -96, -96, -100, -100, -100, -100, -104, -104, -104, -104, -108, -108, -108, -108, -112, -112, -112, -116, -116, -116, -116, -120, -120, -120, -120, -124, -124, -124, -124, -128, -128, -128, -128, 124, 124, 124, 120, 120, 120, 116, 116, 116, 112, 112, 112, 108, 108, 108, 104, 104, 104, 100, 100, 100, 100, 96, 96, 96, 92, 92, 92, 88, 88, 88, 84, 84, 84, 80, 80, 80, 76, 76, 76, 76, 80, 80, 80, 80, 80, 80, 84, 84, 84, 84, 84, 84, 88, 88, 88, 88, 88, 88, 92, 92, 92, 92, 92, 92, 96, 96, 96, 96, 96, 96, 100, 100, 100, 100, 100, 100, 104, 104, 104, 104, 104, 104, 108, 108, 108, 108, 108, 108, 112, 112, 112, 112, 112, 112, 112, 108, 108, 108, 108, 108, 108, 108, 108, 108, 104, 104, 104
        };
        blues = new byte[] {
            -72, -76, -76, -80, -80, -84, -84, -88, -88, -92, -92, -92, -96, -96, -100, -100, -104, -104, -108, -108, -112, -112, -116, -116, -120, -120, -124, -124, -128, -128, 124, 124, 120, 120, 120, 112, 104, 100, 92, 84, 80, 84, 88, 88, 92, 92, 96, 96, 100, 100, 104, 104, 108, 112, 112, 116, 116, 120, 120, 124, 124, -128, -128, 124, 124, 124, 124, 112, 112, 108, 108, 108, 112, 112, 116, 116, 120, 120, 124, 124, -128, -128, -124, -124, -124, -120, -120, -116, -116, -112, -112, -108, -108, -104, -104, -100, -100, -100, -96, -96, -92, -92, -88, -88, -84, -84, -80, -80, -76, -76, -76, -72, -72, -68, -68, -64, -64, -60, -60, -56, -56, -52, -52, -52, -48, -48, -44, -44, -40, -40, -36, -36, -32, -32, -28, -28, -28, -24, -24, -20, -20, -16, -16, -12, -12, -8, -8, -8, -16, -20, -24, -32, -36, -40, -44, -52, -56, -60, -64, -72, -76, -80, -88, -92, -96, -100, -108, -112, -116, -120, -128, 124, 120, 116, 108, 104, 100, 92, 88, 84, 80, 72, 68, 64, 60, 52, 48, 44, 40, 44, 48, 52, 56, 56, 60, 64, 68, 68, 72, 76, 80, 80, 84, 88, 92, 92, 96, 100, 104, 108, 108, 112, 116, 120, 120, 124, -128, -124, -124, -120, -116, -112, -112, -108, -104, -100, -96, -96, -92, -88, -84, -84, -80, -76, -72, -72, -68, -64, -60, -60, -56, -52, -48, -48, -52, -52, -56, -56, -60, -60, -64, -64, -68, -68, -72, -72
        };
        icm[3] = new IndexColorModel(8, 256, reds, greens, blues);
        
        reds = new byte[] {
            -20, -20, -24, -28, -28, -32, -36, -36, -40, -44, -44, -48, -52, -52, -56, -60, -60, -64, -68, -68, -72, -76, -76, -80, -84, -84, -88, -92, -92, -96, -100, -100, -104, -108, -108, -112, -116, -116, -120, -124, -124, -128, 124, 124, 120, 116, 112, 112, 108, 104, 104, 100, 96, 96, 92, 88, 88, 84, 80, 80, 76, 72, 72, 68, 64, 64, 60, 56, 56, 52, 48, 48, 44, 40, 40, 36, 32, 32, 28, 24, 24, 20, 16, 16, 12, 8, 8, 4, 0, 0, 8, 16, 24, 32, 40, 48, 56, 64, 72, 68, 64, 60, 56, 52, 48, 44, 40, 36, 36, 32, 32, 28, 28, 28, 24, 24, 20, 20, 20, 16, 16, 12, 12, 12, 8, 8, 4, 4, 4, 8, 12, 12, 16, 16, 20, 20, 24, 24, 28, 28, 32, 32, 36, 36, 40, 40, 44, 44, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 56, 56, 56, 56, 56, 56, 56, 56, 56, 56, 56, 56, 56, 56, 56, 56, 56, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 68, 68, 68, 68, 68, 72, 72, 72, 72, 72, 76, 76, 76, 76, 76, 80, 80, 80, 80, 80, 84, 84, 84, 84
        };
        greens = new byte[] {
            -24, -24, -24, -24, -24, -24, -24, -24, -24, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -36, -36, -36, -36, -36, -36, -36, -36, -36, -36, -36, -36, -40, -40, -40, -40, -40, -40, -40, -40, -40, -40, -40, -44, -44, -44, -44, -44, -44, -44, -44, -44, -44, -44, -44, -48, -48, -48, -48, -48, -48, -48, -48, -48, -48, -48, -52, -52, -52, -52, -52, -52, -52, -52, -52, -52, -52, -52, -56, -60, -64, -68, -68, -72, -76, -80, -80, -72, -68, -64, -60, -52, -48, -44, -40, -44, -44, -44, -48, -48, -48, -52, -52, -52, -56, -56, -56, -60, -60, -60, -64, -64, -64, -68, -68, -68, -68, -76, -84, -92, -100, -108, -116, -124, 124, 116, 108, 100, 92, 84, 76, 68, 60, 52, 44, 40, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 12, 16, 16, 20, 20, 24, 24, 28, 28, 32, 32, 36, 36, 40, 44, 44, 48, 48, 52, 52, 56, 56, 60, 60
        };
        blues = new byte[] {
            4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 28, 40, 52, 64, 76, 88, 100, 112, 124, 120, 120, 116, 116, 116, 112, 112, 112, 116, 120, 124, 124, -128, -124, -120, -120, -116, -112, -112, -108, -104, -100, -100, -96, -92, -88, -88, -84, -80, -80, -84, -88, -88, -92, -92, -96, -96, -100, -100, -104, -104, -108, -108, -112, -112, -116, -116, -120, -120, -124, -124, -128, -128, -128, 124, 124, 124, 120, 120, 116, 116, 116, 112, 112, 112, 108, 108, 104, 104, 104, 100, 100, 100, 96, 96, 96, 92, 92, 88, 88, 88, 84, 84, 84, 80, 80, 76, 76, 76, 72, 72, 72, 68, 68, 68, 64, 64, 60, 60, 60, 56, 56, 56, 52, 52, 48, 48, 48, 44, 44, 44, 40, 40, 40, 36, 36, 32, 32, 32, 28, 28, 28, 24, 24, 20, 20, 20, 16, 16, 16, 12, 12, 12, 16, 16, 16, 16, 20, 20, 20, 20, 24, 24, 24, 24, 28, 28, 28, 28, 32, 32, 32, 32, 36, 36, 36, 36
        };
        icm[4] = new IndexColorModel(8, 256, reds, greens, blues);
        
        reds = new byte[] {
            0, 60, 60, 60, 64, 64, 64, 64, 68, 68, 68, 68, 72, 72, 72, 72, 76, 76, 76, 76, 76, 80, 80, 80, 80, 84, 84, 84, 84, 88, 88, 88, 88, 92, 92, 92, 92, 96, 96, 96, 96, 96, 100, 100, 100, 100, 104, 104, 104, 104, 108, 108, 108, 108, 112, 112, 112, 112, 116, 116, 116, 116, 120, 120, 124, 124, -128, -128, -124, -124, -120, -120, -116, -116, -112, -112, -108, -108, -104, -104, -100, -100, -96, -96, -92, -92, -88, -88, -84, -84, -80, -80, -76, -76, -72, -68, -68, -64, -64, -60, -60, -56, -56, -52, -52, -48, -48, -44, -44, -40, -40, -36, -36, -32, -32, -28, -28, -24, -24, -20, -20, -16, -16, -12, -12, -8, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -8, -12, -16, -16, -20, -24, -28, -28, -32, -36, -40, -44, -44, -48, -52, -56, -56, -60, -64, -68, -72, -72, -76, -80, -84, -84, -88, -92, -96, -96, -100, -104, -108, -112, -112, -116, -120, -124, -124, -128, 124, 120, 116, 116, 112, 108, 104, 104, 100, 96, 92, 88, 88, 84, 80, 76, 76, 72, 68, 64, 60, 60, 60, 60
        };
        greens = new byte[] {
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48, 52, 56, 60, 64, 68, 72, 76, 80, 84, 88, 92, 96, 100, 104, 108, 112, 116, 120, 124, -128, -124, -120, -116, -112, -108, -104, -100, -96, -92, -88, -84, -80, -76, -72, -68, -64, -60, -56, -52, -48, -44, -40, -36, -32, -28, -24, -20, -16, -12, -8, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -8, -12, -16, -20, -24, -28, -32, -36, -40, -44, -48, -52, -56, -60, -64, -68, -72, -76, -80, -84, -88, -92, -96, -100, -104, -108, -112, -116, -120, -124, -128, 124, 120, 116, 112, 108, 104, 100, 96, 92, 88, 84, 80, 76, 72, 68, 64, 60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 0, 0, 0, 0
        };
        blues = new byte[] {
            0, 80, 80, 84, 84, 84, 88, 88, 88, 92, 92, 92, 96, 96, 96, 100, 100, 100, 104, 104, 104, 104, 108, 108, 108, 112, 112, 112, 116, 116, 116, 120, 120, 120, 124, 124, 124, -128, -128, -128, -124, -124, -124, -124, -120, -120, -120, -116, -116, -116, -112, -112, -112, -108, -108, -108, -104, -104, -104, -100, -100, -100, -96, -96, -96, -92, -92, -92, -88, -88, -88, -84, -84, -84, -80, -80, -76, -76, -76, -72, -72, -72, -68, -68, -68, -64, -64, -64, -60, -60, -56, -56, -56, -52, -52, -52, -48, -48, -48, -44, -44, -40, -40, -40, -36, -36, -36, -32, -32, -32, -28, -28, -28, -24, -24, -20, -20, -20, -16, -16, -16, -12, -12, -12, -8, -8, -4, -4, -8, -12, -16, -20, -24, -28, -32, -36, -40, -44, -48, -52, -56, -60, -64, -68, -72, -76, -80, -84, -88, -92, -96, -100, -104, -108, -112, -116, -120, -124, -128, 124, 120, 116, 112, 108, 104, 100, 96, 92, 88, 84, 80, 76, 72, 68, 64, 60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0, 0, 0, 0, 4, 4, 4, 8, 8, 8, 12, 12, 12, 16, 16, 16, 20, 20, 20, 24, 24, 24, 28, 28, 28, 32, 32, 32, 36, 36, 36, 36, 40, 40, 40, 44, 44, 44, 48, 48, 48, 52, 52, 52, 56, 56, 56, 60, 60, 60, 64, 64, 64, 68, 68, 68, 72, 72, 72, 76, 76, 76, 80, 80, 80, 80
        };
        icm[5] = new IndexColorModel(8, 256, reds, greens, blues);
        
        reds = new byte[] {
            0, 0, 4, 4, 4, 4, 8, 8, 8, 12, 12, 16, 16, 20, 20, 24, 24, 28, 28, 32, 32, 36, 36, 40, 40, 44, 44, 48, 48, 52, 52, 56, 60, 60, 64, 64, 68, 68, 68, 68, 72, 72, 76, 76, 80, 80, 84, 84, 40, 40, 44, 44, 44, 44, 44, 44, 48, 48, 48, 48, 48, 48, 52, 52, 56, 56, 60, 60, 60, 60, 60, 60, 60, 60, 64, 64, 64, 64, 64, 64, 68, 68, 68, 68, 68, 72, 72, 72, 72, 76, 76, 80, 80, 80, 80, 84, 84, 88, 88, 88, 88, 92, 92, 96, 96, 96, 100, 100, 100, 100, 104, 104, 104, 108, 108, 108, 112, 112, 112, 112, 116, 116, 116, 120, 120, 120, 124, 124, 124, -128, -128, -128, -124, -124, -120, -120, -120, -120, -116, -116, -116, -112, -112, -112, -108, -108, -104, -104, -100, -100, -96, -92, -88, -88, -84, -84, -80, -80, -76, -76, -72, -72, -68, -68, -64, -60, -60, -56, -52, -52, -48, -48, -44, -44, -40, -36, -36, -32, -28, -28, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -24, -28, -28, -28, -28, -32, -32, -32, -32, -36, -36, -36, -36, -40, -40, -40, -40, -128, -128, -4, -4, -4, -4, -4, -4, -4, -4, -64, -64, -4, -4, -4, -4, -4, -4, -4
        };
        greens = new byte[] {
            0, 0, 0, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48, 52, 56, 60, 64, 68, 72, 76, 80, 84, 88, 92, 96, 100, 104, 108, 112, 116, 120, 124, -128, -124, -120, -124, -120, -116, -112, -108, -104, -100, -96, -92, -88, -84, -80, 124, 124, 124, 124, 124, 124, -128, -128, -128, -128, -128, -128, -124, -124, -124, -124, -124, -124, -124, -124, -120, -120, -120, -120, -116, -116, -116, -116, -116, -116, -112, -112, -112, -112, -112, -112, -108, -108, -108, -104, -104, -104, -100, -100, -100, -96, -96, -96, -92, -92, -92, -88, -88, -88, -84, -84, -84, -80, -80, -80, -76, -76, -76, -72, -72, -72, -68, -68, -68, -68, -64, -64, -64, -60, -60, -60, -56, -56, -56, -52, -52, -52, -48, -48, -48, -44, -44, -44, -40, -40, -40, -36, -36, -36, -32, -32, -32, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -32, -32, -36, -40, -40, -44, -44, -48, -52, -52, -56, -56, -56, -60, -60, -64, -64, -68, -68, -72, -72, -76, -76, -76, -80, -80, -80, -80, -84, -84, -88, -88, -92, -92, -96, -96, -100, -104, -104, -108, -108, -116, -116, -124, -124, 124, 124, 116, -128, -128, -4, -4, -4, -4, -4, -4, -4, -4, -64, -64, -4, -4, -4, -4, -4, -4, -4
        };
        blues = new byte[] {
            0, -88, -84, -84, -84, -84, -80, -80, -80, -80, -76, -72, -72, -72, -68, -64, -64, -64, -60, -56, -56, -56, -52, -48, -48, -48, -44, -40, -40, -40, -36, -32, -32, -32, -28, -24, -24, -24, -24, -24, -20, -16, -16, -16, -12, -8, -8, -8, 0, 0, 0, 0, 4, 4, 4, 4, 4, 4, 8, 8, 8, 8, 8, 8, 12, 12, 12, 12, 12, 12, 16, 16, 16, 16, 16, 16, 20, 20, 20, 20, 20, 20, 24, 24, 24, 24, 28, 28, 32, 32, 32, 32, 36, 36, 40, 40, 40, 40, 44, 44, 48, 48, 48, 48, 52, 52, 52, 56, 56, 56, 60, 60, 64, 64, 64, 68, 68, 72, 72, 76, 76, 76, 80, 80, 80, 84, 84, 84, 88, 88, 88, 92, 92, 92, 92, 96, 96, 100, 100, 100, 104, 104, 104, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 104, 104, 100, 100, 96, 96, 92, 92, 92, 88, 84, 80, 80, 76, 76, 72, 68, 68, 64, 64, 64, 60, 60, 56, 56, 52, 52, 48, 48, 44, 44, 44, 44, 40, 40, 40, 36, 36, 36, 32, 32, 32, 32, 28, 24, 24, 20, 20, 16, 16, 16, 16, 8, 8, 8, -128, -128, -4, -4, -4, -4, -4, -4, -4, -4, -64, -64, -4, -4, -4, -4, -4, -4, -4
        };
        icm[6] = new IndexColorModel(8, 256, reds, greens, blues);
        
        reds = new byte[] {
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 16, 24, 32, 40, 48, 56, 64, 72, 84, 92, 100, 108, 116, 124, -124, -116, -108, -100, -88, -80, -72, -64, -56, -48, -40, -32, -24, -16, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -8, -16, -24, -32, -40, -48, -56, -64, -72, -80, -88, -96, -104, -112, -120, -128, 124, 116, 108, 100, 92, 84, 76, 68, 60, 52, 44, 36, 28, 20, 12, 4, 12, 20, 28, 36, 44, 52, 60, 68, 76, 84, 92, 100, 108, 116, 124, -128, -124, -120, -116, -112, -108, -104, -100, -96, -92, -88, -84, -80, -76, -72, -68, -64, -60, -56, -52, -48, -44, -40, -36, -32, -28, -24, -20, -16, -12, -8, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, 0, 0, 0, 0, 0
        };
        greens = new byte[] {
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 16, 24, 32, 40, 48, 56, 64, 72, 80, 88, 96, 104, 112, 120, -128, -128, -124, -120, -116, -112, -108, -104, -100, -96, -92, -88, -84, -80, -76, -72, -68, -64, -60, -56, -52, -48, -44, -40, -36, -32, -28, -24, -20, -16, -12, -8, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -24, -48, -72, -92, -116, 116, 92, 72, 48, 24, 0, 8, 20, 32, 44, 56, 68, 80, 88, 100, 112, 124, -120, -108, -96, -88, -76, -64, -52, -40, -28, -16, -4, 0, 0, 0, 0, 0
        };
        blues = new byte[] {
            0, 0, 8, 16, 24, 32, 40, 48, 56, 64, 72, 84, 92, 100, 108, 116, 124, -124, -116, -108, -100, -88, -80, -72, -64, -56, -48, -40, -32, -24, -16, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -4, -12, -20, -28, -36, -44, -56, -64, -72, -80, -88, -96, -108, -116, -124, 124, 116, 108, 96, 88, 80, 72, 64, 56, 44, 36, 28, 20, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
        };
        icm[7] = new IndexColorModel(8, 256, reds, greens, blues);
    }
    
    public IndexColorModel[] getIndexColorModelArray() {
        return this.icm;
    }
}
