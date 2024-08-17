let generated = false;
let picked = 0;
let x, y;

function pick(b){

    picked = b;

}

let map = new Array(0);

function generate(){


    document.getElementById("content").innerHTML = "";
    document.getElementById("picker").innerHTML = "";
    document.getElementById("text").innerHTML = "";


    generated = true;

    for(let k = 0; k <=6; k++){
        document.getElementById("picker").innerHTML += '<div class="b'+k+' pick" onclick="pick('+k+')"></div>';
    }

    x = document.getElementById("x").value;
    y = document.getElementById("y").value;
    let bg = document.getElementById("bg").value;


    if (x == 0 || y == 0) return document.write("Mapa nie moze byc mniejsza niz 1 debilu zajebany");
    if (bg == "") bg = 0;

    map = new Array(x*y);
    map.fill(bg);



    let square_id = 0;

    for(let i = 0; i< y; i++){

        for(let j = 0; j< x; j++){

            document.getElementById("content").innerHTML += '<div class="b'+bg+' square"onclick="change('+square_id+')"></div>';
            square_id++;
        }

        document.getElementById("content").innerHTML += '<div class="break"></div>';

    }
    
}

function change(block){

    let b = document.getElementsByClassName("square")[block];

    for (let l = 0; l <= 6; l++){
        b.classList.remove('b'+ l);
    }

    b.classList.add('b'+ picked);

    map[block] = picked;

}

function generate_txt(){

    if (!generated) return document.write("jaki ty tekst chcesz generowac jak ty kurwa nie masz co generowac glupia szmato");
    else{

        document.getElementById("text").innerHTML = "";

        let i = 0;

        for(let p = 0; p < y; p++){
            for(let r = 0; r < x; r++){
                document.getElementById("text").innerHTML += map[i] + " ";
                i++
            }
            document.getElementById("text").innerHTML += '<br/>';
        }

    }
    console.log(map);
}