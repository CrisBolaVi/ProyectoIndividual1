import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { Ordenador } from '../ordenador';
import { OrdenadorRestService } from '../ordenador-rest.service';

@Component({
  selector: 'app-formulario-ordenador',
  imports: [FormsModule],
  templateUrl: './formulario-ordenador.component.html',
  styleUrl: './formulario-ordenador.component.scss'
})
export class FormularioOrdenadorComponent {

  ordenador:Ordenador={}as Ordenador;
  
  constructor(private ordenadorRestService:OrdenadorRestService,private router:Router){
  }

  public insertar(){
    this.ordenadorRestService.insertar(this.ordenador).subscribe((datos)=>{
      console.log("insertado");
      this.router.navigate(["/listaordenador"]);
    })
  }

}
