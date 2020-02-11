/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.model;

/**
 *
 */
public class modelException extends Exception {

    /**
     * Creates a new instance of <code>modelException</code> without detail
     * message.
     */
    public modelException() {
    }

    /**
     * Constructs an instance of <code>modelException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public modelException(String msg) {
        super(msg);
    }
}