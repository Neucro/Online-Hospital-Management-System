/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author smtajwar
 */
public interface IObserver<T> extends Serializable {
    void update(IObservable o, T arg);
}