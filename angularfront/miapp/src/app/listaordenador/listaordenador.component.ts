import { Component } from '@angular/core';
import { Ordenador } from '../ordenador';
import { RouterLink } from '@angular/router';
import { OrdenadorRestService } from '../ordenador-rest.service';


@Component({
  selector: 'app-listaordenador',
  imports: [RouterLink],
  templateUrl: './listaordenador.component.html',
  styleUrl: './listaordenador.component.scss'
})
export class ListaordenadorComponent {
  listaordenador: Ordenador[] = [];
  constructor(private ordenadorRestservice: OrdenadorRestService) {
    ordenadorRestservice.buscarTodos().subscribe((datos) => {
      this.listaordenador = datos;
    })
  }

  borrar(ordenador: Ordenador) {
    this.ordenadorRestservice.borrar(ordenador).subscribe((datos) => {
      this.ordenadorRestservice.buscarTodos().subscribe((datos) => {
        this.listaordenador = datos;
      })

    })
  }

}