/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapplication;

import java.awt.event.KeyEvent;

/**
 *
 * @author burhancabiroglu
 */
public interface Command {

    public void  Redo();
    public void  Undo();
}
