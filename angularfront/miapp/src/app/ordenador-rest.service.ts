import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Ordenador } from './ordenador';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class OrdenadorRestService {
  constructor(private httpClient:HttpClient) { }
  
  public buscarTodos():Observable<Ordenador[]>{
  
  return this.httpClient.get<Ordenador[]>("http://localhost:8080/webapi/ordenador");
  }
  
  public insertar (ordenador:Ordenador):Observable<Ordenador>{
    return this.httpClient.post<Ordenador>("http://localhost:8080/webapi/ordenador",ordenador);
  
  }
  
  
  public borrar (ordenador:Ordenador):Observable<Ordenador>{
    return this.httpClient.delete<Ordenador>(`http://localhost:8080/webapi/ordenador/${ordenador.numserie}`);
  }
  }
 

