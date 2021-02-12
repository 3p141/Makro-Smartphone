package kickstart.controller;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Makros {
    Robot r;

    public void Makros() throws AWTException {
        Robot r = new Robot();
        this.r = r;
    }

    public void execute(ArrayList<String> array) {
        for (int i = 0; i < array.size(); i++) {
            pressRelease(array.get(i));
        }
    }

    public void pressRelease(String exeCode) {
        switch (exeCode) {
            case "aStart":
                r.keyPress(KeyEvent.VK_A);
                break;

            case "bStart":
                r.keyPress(KeyEvent.VK_B);
                break;

            case "cStart":
                r.keyPress(KeyEvent.VK_C);
                break;

            case "dStart":
                r.keyPress(KeyEvent.VK_D);
                break;

            case "eStart":
                r.keyPress(KeyEvent.VK_E);
                break;

            case "fStart":
                r.keyPress(KeyEvent.VK_F);
                break;

            case "gStart":
                r.keyPress(KeyEvent.VK_G);
                break;

            case "hStart":
                r.keyPress(KeyEvent.VK_H);
                break;

            case "iStart":
                r.keyPress(KeyEvent.VK_I);
                break;

            case "jStart":
                r.keyPress(KeyEvent.VK_J);
                break;

            case "kStart":
                r.keyPress(KeyEvent.VK_K);
                break;

            case "lStart":
                r.keyPress(KeyEvent.VK_L);
                break;

            case "mStart":
                r.keyPress(KeyEvent.VK_M);
                break;

            case "nStart":
                r.keyPress(KeyEvent.VK_N);
                break;

            case "oStart":
                r.keyPress(KeyEvent.VK_O);
                break;

            case "pStart":
                r.keyPress(KeyEvent.VK_P);
                break;

            case "qStart":
                r.keyPress(KeyEvent.VK_Q);
                break;

            case "rStart":
                r.keyPress(KeyEvent.VK_R);
                break;

            case "sStart":
                r.keyPress(KeyEvent.VK_S);
                break;

            case "tStart":
                r.keyPress(KeyEvent.VK_T);
                break;

            case "uStart":
                r.keyPress(KeyEvent.VK_U);
                break;

            case "vStart":
                r.keyPress(KeyEvent.VK_V);
                break;

            case "wStart":
                r.keyPress(KeyEvent.VK_W);
                break;

            case "xStart":
                r.keyPress(KeyEvent.VK_X);
                break;

            case "yStart":
                r.keyPress(KeyEvent.VK_Y);
                break;

            case "zStart":
                r.keyPress(KeyEvent.VK_Z);
                break;

            case "1Start":
                r.keyPress(KeyEvent.VK_1);
                break;

            case "2Start":
                r.keyPress(KeyEvent.VK_2);
                break;

            case "3Start":
                r.keyPress(KeyEvent.VK_3);
                break;

            case "4Start":
                r.keyPress(KeyEvent.VK_4);
                break;

            case "5Start":
                r.keyPress(KeyEvent.VK_5);
                break;

            case "6Start":
                r.keyPress(KeyEvent.VK_6);
                break;

            case "7Start":
                r.keyPress(KeyEvent.VK_7);
                break;

            case "8Start":
                r.keyPress(KeyEvent.VK_8);
                break;

            case "9Start":
                r.keyPress(KeyEvent.VK_9);
                break;

            case "0Start":
                r.keyPress(KeyEvent.VK_0);
                break;

            case "n0Start":
                r.keyPress(KeyEvent.VK_NUMPAD0);
                break;

            case "n1Start":
                r.keyPress(KeyEvent.VK_NUMPAD1);
                break;

            case "n2Start":
                r.keyPress(KeyEvent.VK_NUMPAD2);
                break;

            case "n3Start":
                r.keyPress(KeyEvent.VK_NUMPAD3);
                break;

            case "n4Start":
                r.keyPress(KeyEvent.VK_NUMPAD4);
                break;

            case "n5Start":
                r.keyPress(KeyEvent.VK_NUMPAD5);
                break;

            case "n6Start":
                r.keyPress(KeyEvent.VK_NUMPAD6);
                break;

            case "n7Start":
                r.keyPress(KeyEvent.VK_NUMPAD7);
                break;

            case "n8Start":
                r.keyPress(KeyEvent.VK_NUMPAD8);
                break;

            case "n9Start":
                r.keyPress(KeyEvent.VK_NUMPAD9);
                break;

            case "escStart":
                r.keyPress(KeyEvent.VK_ESCAPE);
                break;

            case "cirStart":
                r.keyPress(KeyEvent.VK_CIRCUMFLEX);
                break;

            case "tabStart":
                r.keyPress(KeyEvent.VK_TAB);
                break;

            case "capsStart":
                r.keyPress(KeyEvent.VK_CAPS_LOCK);
                break;

            case "shiftStart":
                r.keyPress(KeyEvent.VK_SHIFT);
                break;

            case "strgStart":
                r.keyPress(KeyEvent.VK_CONTROL);
                break;

            case "windowsStart":
                r.keyPress(KeyEvent.VK_WINDOWS);
                break;

            case "altStart":
                r.keyPress(KeyEvent.VK_ALT);
                break;
                
            case "altGrStart":
            r.keyPress(KeyEvent.VK_ALT_GRAPH);
                break;

            case "f1Start":
                r.keyPress(KeyEvent.VK_F1);
                break;

            case "f2Start":
                r.keyPress(KeyEvent.VK_F2);
                break;

            case "f3Start":
                r.keyPress(KeyEvent.VK_F3);
                break;

            case "f4Start":
                r.keyPress(KeyEvent.VK_F4);
                break;

            case "f5Start":
                r.keyPress(KeyEvent.VK_F5);
                break;

            case "f6Start":
                r.keyPress(KeyEvent.VK_F6);
                break;

            case "f7Start":
                r.keyPress(KeyEvent.VK_F7);
                break;

            case "f8Start":
                r.keyPress(KeyEvent.VK_F8);
                break;

            case "f9Start":
                r.keyPress(KeyEvent.VK_F9);
                break;

            case "f10Start":
                r.keyPress(KeyEvent.VK_F10);
                break;

            case "f11Start":
                r.keyPress(KeyEvent.VK_F11);
                break;

            case "f12Start":
                r.keyPress(KeyEvent.VK_F12);
                break;

            case "printStart":
                r.keyPress(KeyEvent.VK_PRINTSCREEN);
                break;

            case "scrollStart":
                r.keyPress(KeyEvent.VK_SCROLL_LOCK);
                break;

            case "pauseStart":
                r.keyPress(KeyEvent.VK_PAUSE);
                break;

            case "pasteStart":
                r.keyPress(KeyEvent.VK_PASTE);
                break;

            case "delStart":
                r.keyPress(KeyEvent.VK_DELETE);
                break;

            case "pupStart":
                r.keyPress(KeyEvent.VK_PAGE_UP);
                break;

            case "pdownStart":
                r.keyPress(KeyEvent.VK_PAGE_DOWN);
                break;

            case "upStart":
                r.keyPress(KeyEvent.VK_UP);
                break;

            case "downStart":
                r.keyPress(KeyEvent.VK_DOWN);
                break;

            case "leftStart":
                r.keyPress(KeyEvent.VK_LEFT);
                break;

            case "rightStart":
                r.keyPress(KeyEvent.VK_RIGHT);
                break;

            case "plusStart":
                r.keyPress(KeyEvent.VK_PLUS);
                break;

            case "hashStart":
                r.keyPress(KeyEvent.VK_NUMBER_SIGN);
                break;

            case "periodStart":
                r.keyPress(KeyEvent.VK_PERIOD);
                break;

            case "commaStart":
                r.keyPress(KeyEvent.VK_COMMA);
                break;

            case "dashStart":
                r.keyPress(KeyEvent.VK_MINUS);
                break;

            case "enterStart":
                r.keyPress(KeyEvent.VK_ENTER);
                break;

            case "backStart":
                r.keyPress(KeyEvent.VK_BACK_SPACE);
                break;

            
                case "aStop":
                r.keyRelease(KeyEvent.VK_A);
                break;

            case "bStop":
                r.keyRelease(KeyEvent.VK_B);
                break;

            case "cStop":
                r.keyRelease(KeyEvent.VK_C);
                break;

            case "dStop":
                r.keyRelease(KeyEvent.VK_D);
                break;

            case "eStop":
                r.keyRelease(KeyEvent.VK_E);
                break;

            case "fStop":
                r.keyRelease(KeyEvent.VK_F);
                break;

            case "gStop":
                r.keyRelease(KeyEvent.VK_G);
                break;

            case "hStop":
                r.keyRelease(KeyEvent.VK_H);
                break;

            case "iStop":
                r.keyRelease(KeyEvent.VK_I);
                break;

            case "jStop":
                r.keyRelease(KeyEvent.VK_J);
                break;

            case "kStop":
                r.keyRelease(KeyEvent.VK_K);
                break;

            case "lStop":
                r.keyRelease(KeyEvent.VK_L);
                break;

            case "mStop":
                r.keyRelease(KeyEvent.VK_M);
                break;

            case "nStop":
                r.keyRelease(KeyEvent.VK_N);
                break;

            case "oStop":
                r.keyRelease(KeyEvent.VK_O);
                break;

            case "pStop":
                r.keyRelease(KeyEvent.VK_P);
                break;

            case "qStop":
                r.keyRelease(KeyEvent.VK_Q);
                break;

            case "rStop":
                r.keyRelease(KeyEvent.VK_R);
                break;

            case "sStop":
                r.keyRelease(KeyEvent.VK_S);
                break;

            case "tStop":
                r.keyRelease(KeyEvent.VK_T);
                break;

            case "uStop":
                r.keyRelease(KeyEvent.VK_U);
                break;

            case "vStop":
                r.keyRelease(KeyEvent.VK_V);
                break;

            case "wStop":
                r.keyRelease(KeyEvent.VK_W);
                break;

            case "xStop":
                r.keyRelease(KeyEvent.VK_X);
                break;

            case "yStop":
                r.keyRelease(KeyEvent.VK_Y);
                break;

            case "zStop":
                r.keyRelease(KeyEvent.VK_Z);
                break;

            case "1Stop":
                r.keyRelease(KeyEvent.VK_1);
                break;

            case "2Stop":
                r.keyRelease(KeyEvent.VK_2);
                break;

            case "3Stop":
                r.keyRelease(KeyEvent.VK_3);
                break;

            case "4Stop":
                r.keyRelease(KeyEvent.VK_4);
                break;

            case "5Stop":
                r.keyRelease(KeyEvent.VK_5);
                break;

            case "6Stop":
                r.keyRelease(KeyEvent.VK_6);
                break;

            case "7Stop":
                r.keyRelease(KeyEvent.VK_7);
                break;

            case "8Stop":
                r.keyRelease(KeyEvent.VK_8);
                break;

            case "9Stop":
                r.keyRelease(KeyEvent.VK_9);
                break;

            case "0Stop":
                r.keyRelease(KeyEvent.VK_0);
                break;

            case "n0Stop":
                r.keyRelease(KeyEvent.VK_NUMPAD0);
                break;

            case "n1Stop":
                r.keyRelease(KeyEvent.VK_NUMPAD1);
                break;

            case "n2Stop":
                r.keyRelease(KeyEvent.VK_NUMPAD2);
                break;

            case "n3Stop":
                r.keyRelease(KeyEvent.VK_NUMPAD3);
                break;

            case "n4Stop":
                r.keyRelease(KeyEvent.VK_NUMPAD4);
                break;

            case "n5Stop":
                r.keyRelease(KeyEvent.VK_NUMPAD5);
                break;

            case "n6Stop":
                r.keyRelease(KeyEvent.VK_NUMPAD6);
                break;

            case "n7Stop":
                r.keyRelease(KeyEvent.VK_NUMPAD7);
                break;

            case "n8Stop":
                r.keyRelease(KeyEvent.VK_NUMPAD8);
                break;

            case "n9Stop":
                r.keyRelease(KeyEvent.VK_NUMPAD9);
                break;

            case "escStop":
                r.keyRelease(KeyEvent.VK_ESCAPE);
                break;

            case "cirStop":
                r.keyRelease(KeyEvent.VK_CIRCUMFLEX);
                break;

            case "tabStop":
                r.keyRelease(KeyEvent.VK_TAB);
                break;

            case "capsStop":
                r.keyRelease(KeyEvent.VK_CAPS_LOCK);
                break;

            case "shiftStop":
                r.keyRelease(KeyEvent.VK_SHIFT);
                break;

            case "strgStop":
                r.keyRelease(KeyEvent.VK_CONTROL);
                break;

            case "windowsStop":
                r.keyRelease(KeyEvent.VK_WINDOWS);
                break;

            case "altStop":
                r.keyRelease(KeyEvent.VK_ALT);
                break;
                
            case "altGrStop":
            r.keyRelease(KeyEvent.VK_ALT_GRAPH);
                break;

            case "f1Stop":
                r.keyRelease(KeyEvent.VK_F1);
                break;

            case "f2Stop":
                r.keyRelease(KeyEvent.VK_F2);
                break;

            case "f3Stop":
                r.keyRelease(KeyEvent.VK_F3);
                break;

            case "f4Stop":
                r.keyRelease(KeyEvent.VK_F4);
                break;

            case "f5Stop":
                r.keyRelease(KeyEvent.VK_F5);
                break;

            case "f6Stop":
                r.keyRelease(KeyEvent.VK_F6);
                break;

            case "f7Stop":
                r.keyRelease(KeyEvent.VK_F7);
                break;

            case "f8Stop":
                r.keyRelease(KeyEvent.VK_F8);
                break;

            case "f9Stop":
                r.keyRelease(KeyEvent.VK_F9);
                break;

            case "f10Stop":
                r.keyRelease(KeyEvent.VK_F10);
                break;

            case "f11Stop":
                r.keyRelease(KeyEvent.VK_F11);
                break;

            case "f12Stop":
                r.keyRelease(KeyEvent.VK_F12);
                break;

            case "printStop":
                r.keyRelease(KeyEvent.VK_PRINTSCREEN);
                break;

            case "scrollStop":
                r.keyRelease(KeyEvent.VK_SCROLL_LOCK);
                break;

            case "pauseStop":
                r.keyRelease(KeyEvent.VK_PAUSE);
                break;

            case "pasteStop":
                r.keyRelease(KeyEvent.VK_PASTE);
                break;

            case "delStop":
                r.keyRelease(KeyEvent.VK_DELETE);
                break;

            case "pupStop":
                r.keyRelease(KeyEvent.VK_PAGE_UP);
                break;

            case "pdownStop":
                r.keyRelease(KeyEvent.VK_PAGE_DOWN);
                break;

            case "upStop":
                r.keyRelease(KeyEvent.VK_UP);
                break;

            case "downStop":
                r.keyRelease(KeyEvent.VK_DOWN);
                break;

            case "leftStop":
                r.keyRelease(KeyEvent.VK_LEFT);
                break;

            case "rightStop":
                r.keyRelease(KeyEvent.VK_RIGHT);
                break;

            case "plusStop":
                r.keyRelease(KeyEvent.VK_PLUS);
                break;

            case "hashStop":
                r.keyRelease(KeyEvent.VK_NUMBER_SIGN);
                break;

            case "periodStop":
                r.keyRelease(KeyEvent.VK_PERIOD);
                break;

            case "commaStop":
                r.keyRelease(KeyEvent.VK_COMMA);
                break;

            case "dashStop":
                r.keyRelease(KeyEvent.VK_MINUS);
                break;

            case "enterStop":
                r.keyRelease(KeyEvent.VK_ENTER);
                break;

            case "backStop":
                r.keyRelease(KeyEvent.VK_BACK_SPACE);
                break;

            
        }
    }
}
